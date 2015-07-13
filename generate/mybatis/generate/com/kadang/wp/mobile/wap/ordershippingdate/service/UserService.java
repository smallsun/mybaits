package com.kadang.wp.mobile.wap.ordershippingdate.service;

import java.util.List;

import com.kadang.wp.mobile.wap.ordershippingdate.entity.User;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright wap
 */
public interface UserService{
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public User selectUserByID(User query);
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<User> selectUserForPageList(User query);
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<User> selectUserForList(User query);
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insertUser(User insertDO);
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int updateUser(User updateDO);
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int deleteUser(User deleteDO);
}
