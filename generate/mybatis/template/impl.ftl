package ${packageName}.dao.impl;

import java.util.List;
import com.kadang.freework.container.base.DaoSupport;
import ${packageName}.entity.${table.dataObjectName};
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import ${packageName}.dao.${table.dataObjectName}Dao;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright wap
 */
public class ${table.dataObjectName}DaoImpl extends DaoSupport implements ${table.dataObjectName}Dao {
	
	
	@Resource(name = "sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public ${table.dataObjectName} select${table.dataObjectName}ByID(${table.dataObjectName} query) {
		return (${table.dataObjectName})this.getSqlSession().selectOne("select${table.dataObjectName}ByID", query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public List<${table.dataObjectName}> select${table.dataObjectName}ForPageList(${table.dataObjectName} query){
		 return this.getSqlSession().selectList("select${table.dataObjectName}ForPageList", query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public List<${table.dataObjectName}> select${table.dataObjectName}ForList(${table.dataObjectName} query){
		return this.getSqlSession().selectList("select${table.dataObjectName}ForList", query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int insert${table.dataObjectName}(${table.dataObjectName} insertDO){
		
		return this.getSqlSession().insert("insert${table.dataObjectName}", insertDO);
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int update${table.dataObjectName}(${table.dataObjectName} updateDO){
		return (Integer) this.getSqlSession().update("update${table.dataObjectName}", updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int delete${table.dataObjectName}(${table.dataObjectName} deleteDO){
		return (Integer) this.getSqlSession().delete("delete${table.dataObjectName}", deleteDO);
	}
	
}
