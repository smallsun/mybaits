package ${packageName}.dao.${table.humpObjectName};

import java.util.List;
import com.paperclips.rest.common.base.AbstractDao;
import ${packageName}.dataobject.${table.dataObjectName}DO;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright 
 */
public class ${table.dataObjectName}DaoImpl extends AbstractDao implements ${table.dataObjectName}Dao {
	
		
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public ${table.dataObjectName}DO select${table.dataObjectName}ByID(${table.dataObjectName}DO query) {
		return (${table.dataObjectName}DO) this.selectOne("select${table.dataObjectName}ByID", query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<${table.dataObjectName}DO> select${table.dataObjectName}ForList(${table.dataObjectName}DO query){
		return this.selectList("select${table.dataObjectName}ForList", query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insert${table.dataObjectName}(${table.dataObjectName}DO insertDO){
		return this.insert("insert${table.dataObjectName}", insertDO);
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int update${table.dataObjectName}(${table.dataObjectName}DO updateDO){
		return (Integer) this.update("update${table.dataObjectName}", updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int delete${table.dataObjectName}(${table.dataObjectName}DO deleteDO){
		return (Integer) this.delete("delete${table.dataObjectName}", deleteDO);
	}
	
}
