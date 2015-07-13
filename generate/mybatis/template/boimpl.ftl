package ${packageName}.core.bo.${table.tableName};

import java.util.List;
import com.desksoft.common.base.AbstractBO;
import ${packageName}.dataobject.${table.dataObjectName}DO;
import ${packageName}.core.bo.${table.tableName}.${table.dataObjectName}BO;
import ${packageName}.core.dao.${table.tableName}.${table.dataObjectName}DAO;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright wap
 */
public class ${table.dataObjectName}BOImpl extends AbstractBO implements ${table.dataObjectName}BO  {
	
	private ${table.dataObjectName}DAO ${table.tableName}DAO;
	
	public void set${table.dataObjectName}DAO(${table.dataObjectName}DAO ${table.tableName}DAO) {
		this.${table.tableName}DAO = ${table.tableName}DAO;
	}
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public ${table.dataObjectName}DO select${table.dataObjectName}ByID(${table.dataObjectName}DO query) {
		return this.${table.tableName}DAO.select${table.dataObjectName}ByID(query);
	}
	
	/**
	 * 描述：按条件查询对象列表--分页
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<${table.dataObjectName}DO> select${table.dataObjectName}ForPageList(${table.dataObjectName}DO query){
		 return this.${table.tableName}DAO.select${table.dataObjectName}ForPageList(query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public List<${table.dataObjectName}DO> select${table.dataObjectName}ForList(${table.dataObjectName}DO query){
		return this.${table.tableName}DAO.select${table.dataObjectName}ForList(query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int insert${table.dataObjectName}(${table.dataObjectName}DO insertDO){
		
		return this.${table.tableName}DAO.insert${table.dataObjectName}(insertDO);
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int update${table.dataObjectName}(${table.dataObjectName}DO updateDO){
		return this.${table.tableName}DAO.update${table.dataObjectName}(updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int delete${table.dataObjectName}(${table.dataObjectName}DO deleteDO){
		return this.${table.tableName}DAO.delete${table.dataObjectName}(deleteDO);
	}
	
}
