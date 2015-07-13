package com.kadang.wp.mobile.wap.ordershippingdate.service.impl;

import java.util.List;
import com.kadang.wp.mobile.wap.ordershippingdate.entity.User;
import com.kadang.wp.mobile.wap.ordershippingdate.service.UserService;
import com.kadang.wp.mobile.wap.ordershippingdate.dao.UserDao;
import javax.annotation.Resource;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright wap
 */
public class UserServiceImpl implements UserService  {
	
	@Resource
	private UserDao zh_userDao;
	
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public User selectUserByID(User query) {
		return this.zh_userDao.selectUserByID(query);
	}
	
	/**
	 * 描述：按条件查询对象列表--分页
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public List<User> selectUserForPageList(User query){
		 return this.zh_userDao.selectUserForPageList(query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public List<User> selectUserForList(User query){
		return this.zh_userDao.selectUserForList(query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int insertUser(User insertDO){
		
		return this.zh_userDao.insertUser(insertDO);
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int updateUser(User updateDO){
		return this.zh_userDao.updateUser(updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	@Override
	public int deleteUser(User deleteDO){
		return this.zh_userDao.deleteUser(deleteDO);
	}
	
}
