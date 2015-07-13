package com.paperclips.rest.service.simpleobject.impl;

import java.util.List;
import com.paperclips.rest.common.base.AbstractService;
import com.paperclips.rest.dataobject.SimpleObjectDO;
import com.paperclips.rest.service.simpleobject.SimpleObjectService;
import com.paperclips.rest.dao.simpleobject.SimpleObjectDao;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright 
 */
public class SimpleObjectServiceImpl extends AbstractService implements SimpleObjectService  {
	
	private SimpleObjectDao simpleobjectDao;
	
	public void setSimpleObjectDao(SimpleObjectDao simpleobjectDao) {
		this.simpleobjectDao = simpleobjectDao;
	}
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public SimpleObjectDO selectSimpleObjectByID(SimpleObjectDO query) {
		return this.simpleobjectDao.selectSimpleObjectByID(query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<SimpleObjectDO> selectSimpleObjectForList(SimpleObjectDO query){
		return this.simpleobjectDao.selectSimpleObjectForList(query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insertSimpleObject(SimpleObjectDO insertDO){
		return this.simpleobjectDao.insertSimpleObject(insertDO);
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int updateSimpleObject(SimpleObjectDO updateDO){
		return this.simpleobjectDao.updateSimpleObject(updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int deleteSimpleObject(SimpleObjectDO deleteDO){
		return this.simpleobjectDao.deleteSimpleObject(deleteDO);
	}
	
}
