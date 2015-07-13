package org.mybatis.generator.api;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class ShellRunner {
	static String configFile = "";
	static String templatePath = "";
	static String filePath = "";

	static String packageName = "com.paperclips.rest";

	public static void main(String[] args) {
		gePath();

		List<String> warnings = new ArrayList<String>();

		File configurationFile = new File(configFile);

		Set<String> fullyqualifiedTables = new HashSet<String>();

		Set<String> contexts = new HashSet<String>();

		try {
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configurationFile);

			DefaultShellCallback shellCallback = new DefaultShellCallback(true);

			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);

			ProgressCallback progressCallback = new VerboseProgressCallback();

			List<IntrospectedTable> tables;
			tables = myBatisGenerator.generate(progressCallback, contexts, fullyqualifiedTables);

			/**
			 * 生成 DAO、BO、Mapper
			 */
			Generate g = new Generate(templatePath, filePath, packageName);
			for (IntrospectedTable table : tables) {
				g.generateFile(table);
			}

			/**
			 * 生成springbeans配置文件
			 */
			g.generateFileTables(tables);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
			return;
		}
	}

	public static void gePath() {
		String path = ShellRunner.class.getResource("/").getPath().substring(1);
		String gen = "generate-paperclips";

		String[] p = path.split(gen);

		configFile = p[0] + gen + "/mybatis/generate.xml";
		templatePath = p[0] + gen + "/mybatis/template";
		filePath = p[0] + gen + "/mybatis/generate/";
	}

}
