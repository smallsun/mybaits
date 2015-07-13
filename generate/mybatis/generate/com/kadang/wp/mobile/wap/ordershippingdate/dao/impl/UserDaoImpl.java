package com.kadang.wp.mobile.wap.ordershippingdate.dao.impl;

import java.util.List;
import com.kadang.freework.container.base.DaoSupport;
import com.kadang.wp.mobile.wap.ordershippingdate.entity.User;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import com.kadang.wp.mobile.wap.ordershippingdate.dao.UserDao;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright wap
 */
public class UserDaoImpl extends DaoSupport implements UserDao {
	
	
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
	public User selectUserByID(User query) {
		return (User)this.getSqlSession().selectOne("selectUserByID", query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public List<User> selectUserForPageList(User query){
		 return this.getSqlSession().selectList("selectUserForPageList", query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public List<User> selectUserForList(User query){
		return this.getSqlSession().selectList("selectUserForList", query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int insertUser(User insertDO){
		
		return this.getSqlSession().insert("insertUser", insertDO);
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int updateUser(User updateDO){
		return (Integer) this.getSqlSession().update("updateUser", updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int deleteUser(User deleteDO){
		return (Integer) this.getSqlSession().delete("deleteUser", deleteDO);
	}
	
}
