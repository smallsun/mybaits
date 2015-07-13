package org.mybatis.generator.api;

public class Column {
	private String columnName;
	private String columnDataType;
	private String columnCName;
	private String columnJdbcTypeName;
	private String humpColumnName;
	private String humpColumnCName;

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;

		this.setColumnCName(columnName.substring(0, 1).toUpperCase() + columnName.substring(1));
	}

	public String getColumnDataType() {
		return columnDataType;
	}

	public void setColumnDataType(String columnDataType) {
		this.columnDataType = columnDataType;
	}

	public String getColumnCName() {
		return columnCName;
	}

	public void setColumnCName(String columnCName) {
		this.columnCName = columnCName;
	}

	public String getHumpColumnName() {
		return humpColumnName;
	}

	public void setHumpColumnName(String humpColumnName) {
		this.humpColumnName = humpColumnName;
		this.setHumpColumnCName(humpColumnName.substring(0, 1).toUpperCase() + humpColumnName.substring(1));
	}

	public String getHumpColumnCName() {
		return humpColumnCName;
	}

	public void setHumpColumnCName(String humpColumnCName) {
		this.humpColumnCName = humpColumnCName;
	}

	public String getColumnJdbcTypeName() {
		return columnJdbcTypeName;
	}

	public void setColumnJdbcTypeName(String columnJdbcTypeName) {
		this.columnJdbcTypeName = columnJdbcTypeName;
	}

}
