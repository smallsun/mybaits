package ${packageName}.service.${table.humpObjectName}.impl;

import java.util.List;
import com.paperclips.rest.common.base.AbstractService;
import ${packageName}.dataobject.${table.dataObjectName}DO;
import ${packageName}.service.${table.humpObjectName}.${table.dataObjectName}Service;
import ${packageName}.dao.${table.humpObjectName}.${table.dataObjectName}Dao;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright 
 */
public class ${table.dataObjectName}ServiceImpl extends AbstractService implements ${table.dataObjectName}Service  {
	
	private ${table.dataObjectName}Dao ${table.humpObjectName}Dao;
	
	public void set${table.dataObjectName}Dao(${table.dataObjectName}Dao ${table.humpObjectName}Dao) {
		this.${table.humpObjectName}Dao = ${table.humpObjectName}Dao;
	}
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public ${table.dataObjectName}DO select${table.dataObjectName}ByID(${table.dataObjectName}DO query) {
		return this.${table.humpObjectName}Dao.select${table.dataObjectName}ByID(query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<${table.dataObjectName}DO> select${table.dataObjectName}ForList(${table.dataObjectName}DO query){
		return this.${table.humpObjectName}Dao.select${table.dataObjectName}ForList(query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insert${table.dataObjectName}(${table.dataObjectName}DO insertDO){
		return this.${table.humpObjectName}Dao.insert${table.dataObjectName}(insertDO);
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int update${table.dataObjectName}(${table.dataObjectName}DO updateDO){
		return this.${table.humpObjectName}Dao.update${table.dataObjectName}(updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int delete${table.dataObjectName}(${table.dataObjectName}DO deleteDO){
		return this.${table.humpObjectName}Dao.delete${table.dataObjectName}(deleteDO);
	}
	
}
