package com.paperclips.rest.dao.simplechildobject;

import java.util.List;
import com.paperclips.rest.common.base.AbstractDao;
import com.paperclips.rest.dataobject.SimpleChildObjectDO;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright 
 */
public class SimpleChildObjectDaoImpl extends AbstractDao implements SimpleChildObjectDao {
	
		
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public SimpleChildObjectDO selectSimpleChildObjectByID(SimpleChildObjectDO query) {
		return (SimpleChildObjectDO) this.selectOne("selectSimpleChildObjectByID", query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<SimpleChildObjectDO> selectSimpleChildObjectForList(SimpleChildObjectDO query){
		return this.selectList("selectSimpleChildObjectForList", query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insertSimpleChildObject(SimpleChildObjectDO insertDO){
		this.insert("insertSimpleChildObject", insertDO);
		return insertDO.getId();
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int updateSimpleChildObject(SimpleChildObjectDO updateDO){
		return (Integer) this.update("updateSimpleChildObject", updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int deleteSimpleChildObject(SimpleChildObjectDO deleteDO){
		return (Integer) this.delete("deleteSimpleChildObject", deleteDO);
	}
	
}
