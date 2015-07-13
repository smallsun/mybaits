/*
 *  Copyright 2005 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mybatis.generator.api;

import static org.mybatis.generator.internal.util.ClassloaderUtility.getCustomClassloader;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.internal.NullProgressCallback;
import org.mybatis.generator.internal.ObjectFactory;

/**
 * This class is the main interface to MyBatis generator. A typical execution of
 * the tool involves these steps:
 * 
 * <ol>
 * <li>Create a Configuration object. The Configuration can be the result of a
 * parsing the XML configuration file, or it can be created solely in Java.</li>
 * <li>Create a MyBatisGenerator object</li>
 * <li>Call one of the generate() methods</li>
 * </ol>
 * 
 * @see org.mybatis.generator.config.xml.ConfigurationParser
 * 
 * @author Jeff Butler
 */
public class MyBatisGenerator {

	private Configuration configuration;


	private List<GeneratedJavaFile> generatedJavaFiles;

	private List<GeneratedXmlFile> generatedXmlFiles;

	private List<String> warnings;


	/**
	 * Constructs a MyBatisGenerator object.
	 * 
	 * @param configuration
	 *            The configuration for this invocation
	 * @param shellCallback
	 *            an instance of a ShellCallback interface. You may specify
	 *            <code>null</code> in which case the DefaultShellCallback will
	 *            be used.
	 * @param warnings
	 *            Any warnings generated during execution will be added to this
	 *            list. Warnings do not affect the running of the tool, but they
	 *            may affect the results. A typical warning is an unsupported
	 *            data type. In that case, the column will be ignored and
	 *            generation will continue. You may specify <code>null</code> if
	 *            you do not want warnings returned.
	 * @throws InvalidConfigurationException
	 *             if the specified configuration is invalid
	 */
	public MyBatisGenerator(Configuration configuration, ShellCallback shellCallback, List<String> warnings)
			throws InvalidConfigurationException {
		super();
		if (configuration == null) {
			throw new IllegalArgumentException(getString("RuntimeError.2")); //$NON-NLS-1$
		} else {
			this.configuration = configuration;
		}

		if (warnings == null) {
			this.warnings = new ArrayList<String>();
		} else {
			this.warnings = warnings;
		}
		generatedJavaFiles = new ArrayList<GeneratedJavaFile>();
		generatedXmlFiles = new ArrayList<GeneratedXmlFile>();

		this.configuration.validate();
	}

	/**
	 * This is the main method for generating code. This method is long running,
	 * but progress can be provided and the method can be canceled through the
	 * ProgressCallback interface. This version of the method runs all
	 * configured contexts.
	 * 
	 * @param callback
	 *            an instance of the ProgressCallback interface, or
	 *            <code>null</code> if you do not require progress information
	 * @throws SQLException
	 * @throws IOException
	 * @throws InterruptedException
	 *             if the method is canceled through the ProgressCallback
	 */
	public void generate(ProgressCallback callback) throws SQLException, IOException, InterruptedException {
		generate(callback, null, null);
	}

	/**
	 * This is the main method for generating code. This method is long running,
	 * but progress can be provided and the method can be canceled through the
	 * ProgressCallback interface.
	 * 
	 * @param callback
	 *            an instance of the ProgressCallback interface, or
	 *            <code>null</code> if you do not require progress information
	 * @param contextIds
	 *            a set of Strings containing context ids to run. Only the
	 *            contexts with an id specified in this list will be run. If the
	 *            list is null or empty, than all contexts are run.
	 * @throws InvalidConfigurationException
	 * @throws SQLException
	 * @throws IOException
	 * @throws InterruptedException
	 *             if the method is canceled through the ProgressCallback
	 */
	public void generate(ProgressCallback callback, Set<String> contextIds) throws SQLException, IOException,
			InterruptedException {
		generate(callback, contextIds, null);
	}

	/**
	 * This is the main method for generating code. This method is long running,
	 * but progress can be provided and the method can be cancelled through the
	 * ProgressCallback interface.
	 * 
	 * @param callback
	 *            an instance of the ProgressCallback interface, or
	 *            <code>null</code> if you do not require progress information
	 * @param contextIds
	 *            a set of Strings containing context ids to run. Only the
	 *            contexts with an id specified in this list will be run. If the
	 *            list is null or empty, than all contexts are run.
	 * @param fullyQualifiedTableNames
	 *            a set of table names to generate. The elements of the set must
	 *            be Strings that exactly match what's specified in the
	 *            configuration. For example, if table name = "foo" and schema =
	 *            "bar", then the fully qualified table name is "foo.bar". If
	 *            the Set is null or empty, then all tables in the configuration
	 *            will be used for code generation.
	 * @return 
	 * @throws InvalidConfigurationException
	 * @throws SQLException
	 * @throws IOException
	 * @throws InterruptedException
	 *             if the method is canceled through the ProgressCallback
	 */
	public List<IntrospectedTable> generate(ProgressCallback callback, Set<String> contextIds, Set<String> fullyQualifiedTableNames)
			throws SQLException, IOException, InterruptedException {

		if (callback == null) {
			callback = new NullProgressCallback();
		}

		generatedJavaFiles.clear();
		generatedXmlFiles.clear();

		// calculate the contexts to run
		List<Context> contextsToRun = configuration.getContexts();

		// setup custom classloader if required
		if (configuration.getClassPathEntries().size() > 0) {
			ClassLoader classLoader = getCustomClassloader(configuration.getClassPathEntries());
			ObjectFactory.addExternalClassLoader(classLoader);
		}

		// now run the introspections...
		int totalSteps = 0;
		for (Context context : contextsToRun) {
			totalSteps += context.getIntrospectionSteps();
		}
		callback.introspectionStarted(totalSteps);

		for (Context context : contextsToRun) {
			context.introspectTables(callback, warnings, fullyQualifiedTableNames);
		}

		// now run the generates
		totalSteps = 0;
		for (Context context : contextsToRun) {
			totalSteps += context.getGenerationSteps();
		}
		callback.generationStarted(totalSteps);
		
		List<IntrospectedTable> tables = new ArrayList<IntrospectedTable>();
		
		for (Context context : contextsToRun) {
			List<IntrospectedTable> table = context.getIntrospectedTables();
			tables.addAll(table);
		}

		return tables;
	}
	
}
