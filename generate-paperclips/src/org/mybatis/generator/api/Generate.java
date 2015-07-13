/*
 *  Copyright 2006 The Apache Software Foundation
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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Generate {
	private String filePath;
	private String packageName;
	Configuration cfg = new Configuration();
	private List<String> fields = new ArrayList<String>();

	public Generate(String templatePath, String filePath, String packageName) throws IOException {
		this.filePath = filePath;
		this.packageName = packageName;
		cfg.setDirectoryForTemplateLoading(new File(templatePath));
		cfg.setObjectWrapper(new DefaultObjectWrapper());

		fields.add("id");
		fields.add("isDelete");
		fields.add("createTime");
		fields.add("updateTime");
		fields.add("descriptions");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void generateFile(IntrospectedTable table) throws IOException, TemplateException {
		String objName = table.getTableConfiguration().getDomainObjectName();
		String humpName = this.underScore2CamelCase(objName);
		Map root = this.generateTable(table);
		root.put("packageName", packageName);
		root.put("sharp", "#");

		String packagePath = packageName.replace(".", "/");

		/**
		 * core DO path
		 */
		generateFile(root, "do.ftl", filePath + packagePath + "/dataobject/" + objName + "DO.java");

		/**
		 * dao path
		 */
		String rPath = packagePath + "/dao/" + humpName + "/";
		generateFile(root, "dao.ftl", filePath + rPath + objName + "Dao.java");
		generateFile(root, "impl.ftl", filePath + rPath + objName + "DaoImpl.java");
		generateFile(root, "xml.ftl", filePath + rPath + objName + "Mapper.xml");

		/**
		 * service path
		 */
		String simplPath = packagePath + "/service/" + humpName + "/";
		generateFile(root, "serviceimpl.ftl", filePath + simplPath + "/impl/" + objName + "ServiceImpl.java");
		generateFile(root, "service.ftl", filePath + simplPath + objName + "Service.java");

		/**
		 * bo path
		 */
		// String boPath = packagePath + "/bo/" +
		// table.getTableConfiguration().getTableName() + "/";
		// generateFile(root, "boimpl.ftl", filePath + boPath + objName +
		// "BOImpl.java");
		// generateFile(root, "bo.ftl", filePath + boPath + objName +
		// "BO.java");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Map generateTable(IntrospectedTable table) {
		Map root = new HashMap();
		Table t = new Table();
		t.setTableName(table.getTableConfiguration().getTableName());

		String dataObjectName = table.getTableConfiguration().getDomainObjectName();
		t.setHumpObjectName(this.underScore2CamelCase(dataObjectName));
		// dataObjectName = dataObjectName.substring(0,1).toLowerCase() +
		// dataObjectName.substring(1);
		t.setDataObjectName(dataObjectName);

		List<Column> dataObjectColumnList = new ArrayList<Column>();
		List<Column> allColumnList = new ArrayList<Column>();
		for (IntrospectedColumn col : table.getPrimaryKeyColumns()) {
			Column c = new Column();
			c.setColumnName(col.getActualColumnName());
			c.setColumnDataType(col.getFullyQualifiedJavaType().getBaseShortName());
			c.setHumpColumnName(this.underScore2CamelCase(col.getActualColumnName()));
			c.setColumnJdbcTypeName(col.getJdbcTypeName());
			dataObjectColumnList.add(c);
			allColumnList.add(c);
		}
		for (IntrospectedColumn col : table.getBaseColumns()) {
			Column c = new Column();
			c.setColumnName(col.getActualColumnName());
			if ("Byte".equals(col.getFullyQualifiedJavaType().getBaseShortName())) {
				c.setColumnDataType("Integer");
			} else {
				c.setColumnDataType(col.getFullyQualifiedJavaType().getBaseShortName());
			}
			c.setColumnJdbcTypeName(col.getJdbcTypeName());
			// 生成驼峰标记去除中横线
			c.setHumpColumnName(this.underScore2CamelCase(col.getActualColumnName()));
			dataObjectColumnList.add(c);
			allColumnList.add(c);
		}
		t.setDataObjectColumnList(dataObjectColumnList);
		t.setAllColumnList(allColumnList);

		root.put("table", t);
		return root;
	}

	public String underScore2CamelCase(String strs) {
		StringBuffer humpName = new StringBuffer();
		String[] elems = strs.split("_");
		for (int i = 0; i < elems.length; i++) {
			elems[i] = elems[i].toLowerCase();
			if (i != 0) {
				String elem = elems[i];
				char first = elem.toCharArray()[0];
				elems[i] = "" + (char) (first - 32) + elem.substring(1);
			}
		}
		for (String e : elems) {
			humpName.append(e);
		}
		return humpName.toString();
	}

	@SuppressWarnings("rawtypes")
	public void generateFile(Map root, String templatePath, String filePath) throws IOException, TemplateException {
		Template temp = cfg.getTemplate(templatePath);
		File f = new File(filePath);
		File fp = new File(f.getParent());
		if (!fp.exists()) {
			fp.mkdirs();
		}
		Writer out = new OutputStreamWriter(new FileOutputStream(filePath));
		temp.process(root, out);
		out.flush();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void generateFileTables(List<IntrospectedTable> list) throws IOException, TemplateException {

		Map root = new HashMap();

		for (IntrospectedTable introspectedTable : list) {
			String objectName = introspectedTable.getTableConfiguration().getDomainObjectName();
			String humpObjectName = this.underScore2CamelCase(objectName);
			introspectedTable.getTableConfiguration().setHumpObjectName(humpObjectName);
		}
		root.put("tablelist", list);

		root.put("packageName", packageName);

		root.put("address", "${remote.service.address}");

		String packagePath = packageName.replace(".", "/");
		String servicePath = packagePath + "/xml/";
		String dataPath = packagePath + "/xml/";

		generateFile(root, "daoxml.ftl", filePath + dataPath + "springbeans-dao.xml");

		generateFile(root, "servicexml.ftl", filePath + servicePath + "springbeans-service.xml");

	}
}
