package ${packageName}.core.bo.${table.tableName};

import java.util.List;

import ${packageName}.dataobject.${table.dataObjectName}DO;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright wap
 */
public interface ${table.dataObjectName}BO{
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public ${table.dataObjectName}DO select${table.dataObjectName}ByID(${table.dataObjectName}DO query);
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<${table.dataObjectName}DO> select${table.dataObjectName}ForPageList(${table.dataObjectName}DO query);
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<${table.dataObjectName}DO> select${table.dataObjectName}ForList(${table.dataObjectName}DO query);
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insert${table.dataObjectName}(${table.dataObjectName}DO insertDO);
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int update${table.dataObjectName}(${table.dataObjectName}DO updateDO);
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int delete${table.dataObjectName}(${table.dataObjectName}DO deleteDO);
}
