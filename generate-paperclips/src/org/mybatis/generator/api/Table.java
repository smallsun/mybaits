package org.mybatis.generator.api;

import java.util.List;

public class Table {
	/**
	 * 表名 userTemplate
	 */
	private String tableName;

	/**
	 * dataobject对象名 UserTemplate
	 */
	private String dataObjectName;

	private String humpObjectName;

	/**
	 * dataobject对象属性List
	 */
	private List<Column> dataObjectColumnList;

	/**
	 * 所有属性List
	 */
	private List<Column> allColumnList;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDataObjectName() {
		return dataObjectName;
	}

	public void setDataObjectName(String dataObjectName) {
		this.dataObjectName = dataObjectName;
	}

	public List<Column> getDataObjectColumnList() {
		return dataObjectColumnList;
	}

	public void setDataObjectColumnList(List<Column> dataObjectColumnList) {
		this.dataObjectColumnList = dataObjectColumnList;
	}

	public List<Column> getAllColumnList() {
		return allColumnList;
	}

	public void setAllColumnList(List<Column> allColumnList) {
		this.allColumnList = allColumnList;
	}

	public String getHumpObjectName() {
		return humpObjectName;
	}

	public void setHumpObjectName(String humpObjectName) {
		this.humpObjectName = humpObjectName;
	}

}
