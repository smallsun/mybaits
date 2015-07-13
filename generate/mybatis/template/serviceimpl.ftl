package ${packageName}.service.impl;

import java.util.List;
import ${packageName}.entity.${table.dataObjectName};
import ${packageName}.service.${table.dataObjectName}Service;
import ${packageName}.dao.${table.dataObjectName}Dao;
import javax.annotation.Resource;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright wap
 */
public class ${table.dataObjectName}ServiceImpl implements ${table.dataObjectName}Service  {
	
	@Resource
	private ${table.dataObjectName}Dao ${table.tableName}Dao;
	
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public ${table.dataObjectName} select${table.dataObjectName}ByID(${table.dataObjectName} query) {
		return this.${table.tableName}Dao.select${table.dataObjectName}ByID(query);
	}
	
	/**
	 * 描述：按条件查询对象列表--分页
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public List<${table.dataObjectName}> select${table.dataObjectName}ForPageList(${table.dataObjectName} query){
		 return this.${table.tableName}Dao.select${table.dataObjectName}ForPageList(query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public List<${table.dataObjectName}> select${table.dataObjectName}ForList(${table.dataObjectName} query){
		return this.${table.tableName}Dao.select${table.dataObjectName}ForList(query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int insert${table.dataObjectName}(${table.dataObjectName} insertDO){
		
		return this.${table.tableName}Dao.insert${table.dataObjectName}(insertDO);
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int update${table.dataObjectName}(${table.dataObjectName} updateDO){
		return this.${table.tableName}Dao.update${table.dataObjectName}(updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int delete${table.dataObjectName}(${table.dataObjectName} deleteDO){
		return this.${table.tableName}Dao.delete${table.dataObjectName}(deleteDO);
	}
	
}
