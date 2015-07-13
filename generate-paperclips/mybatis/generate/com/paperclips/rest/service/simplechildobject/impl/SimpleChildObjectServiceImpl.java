package com.paperclips.rest.service.simplechildobject.impl;

import java.util.List;
import com.paperclips.rest.common.base.AbstractService;
import com.paperclips.rest.dataobject.SimpleChildObjectDO;
import com.paperclips.rest.service.simplechildobject.SimpleChildObjectService;
import com.paperclips.rest.dao.simplechildobject.SimpleChildObjectDao;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright 
 */
public class SimpleChildObjectServiceImpl extends AbstractService implements SimpleChildObjectService  {
	
	private SimpleChildObjectDao simplechildobjectDao;
	
	public void setSimpleChildObjectDao(SimpleChildObjectDao simplechildobjectDao) {
		this.simplechildobjectDao = simplechildobjectDao;
	}
	
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public SimpleChildObjectDO selectSimpleChildObjectByID(SimpleChildObjectDO query) {
		return this.simplechildobjectDao.selectSimpleChildObjectByID(query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<SimpleChildObjectDO> selectSimpleChildObjectForList(SimpleChildObjectDO query){
		return this.simplechildobjectDao.selectSimpleChildObjectForList(query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insertSimpleChildObject(SimpleChildObjectDO insertDO){
		return this.simplechildobjectDao.insertSimpleChildObject(insertDO);
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int updateSimpleChildObject(SimpleChildObjectDO updateDO){
		return this.simplechildobjectDao.updateSimpleChildObject(updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int deleteSimpleChildObject(SimpleChildObjectDO deleteDO){
		return this.simplechildobjectDao.deleteSimpleChildObject(deleteDO);
	}
	
}
