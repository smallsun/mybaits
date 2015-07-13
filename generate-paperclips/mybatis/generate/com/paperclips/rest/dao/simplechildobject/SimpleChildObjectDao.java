package com.paperclips.rest.dao.simplechildobject;

import java.util.List;

import com.paperclips.rest.dataobject.SimpleChildObjectDO;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright 
 */
public interface SimpleChildObjectDao{
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public SimpleChildObjectDO selectSimpleChildObjectByID(SimpleChildObjectDO query);
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<SimpleChildObjectDO> selectSimpleChildObjectForList(SimpleChildObjectDO query);
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insertSimpleChildObject(SimpleChildObjectDO insertDO);
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int updateSimpleChildObject(SimpleChildObjectDO updateDO);
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int deleteSimpleChildObject(SimpleChildObjectDO deleteDO);
}
