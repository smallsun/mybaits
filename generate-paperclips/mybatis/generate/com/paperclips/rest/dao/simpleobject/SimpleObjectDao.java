package com.paperclips.rest.dao.simpleobject;

import java.util.List;

import com.paperclips.rest.dataobject.SimpleObjectDO;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright 
 */
public interface SimpleObjectDao{
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public SimpleObjectDO selectSimpleObjectByID(SimpleObjectDO query);
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<SimpleObjectDO> selectSimpleObjectForList(SimpleObjectDO query);
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insertSimpleObject(SimpleObjectDO insertDO);
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int updateSimpleObject(SimpleObjectDO updateDO);
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int deleteSimpleObject(SimpleObjectDO deleteDO);
}
