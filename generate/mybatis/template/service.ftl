package ${packageName}.service;

import java.util.List;

import ${packageName}.entity.${table.dataObjectName};

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright wap
 */
public interface ${table.dataObjectName}Service{
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public ${table.dataObjectName} select${table.dataObjectName}ByID(${table.dataObjectName} query);
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<${table.dataObjectName}> select${table.dataObjectName}ForPageList(${table.dataObjectName} query);
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<${table.dataObjectName}> select${table.dataObjectName}ForList(${table.dataObjectName} query);
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insert${table.dataObjectName}(${table.dataObjectName} insertDO);
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int update${table.dataObjectName}(${table.dataObjectName} updateDO);
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int delete${table.dataObjectName}(${table.dataObjectName} deleteDO);
}
