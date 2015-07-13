package com.paperclips.rest.dao.simpleobject;

import java.util.List;
import com.paperclips.rest.common.base.AbstractDao;
import com.paperclips.rest.dataobject.SimpleObjectDO;

/**
 * @author 自动生成
 * @version 
 * @description 
 * @copyright 
 */
public class SimpleObjectDaoImpl extends AbstractDao implements SimpleObjectDao {
	
		
	/**
	 * 描述：按条件查询单个对象
	 * 责任人：
	 * 创建时间：
	 */
	public SimpleObjectDO selectSimpleObjectByID(SimpleObjectDO query) {
		return (SimpleObjectDO) this.selectOne("selectSimpleObjectByID", query);
	}
	
	/**
	 * 描述：按条件查询对象列表
	 * 责任人：
	 * 创建时间：
	 */
	public List<SimpleObjectDO> selectSimpleObjectForList(SimpleObjectDO query){
		return this.selectList("selectSimpleObjectForList", query);
	}
	
	/**
	 * 描述：表格数据插入
	 * 责任人：
	 * 创建时间：
	 */
	public int insertSimpleObject(SimpleObjectDO insertDO){
		this.insert("insertSimpleObject", insertDO);
		return insertDO.getId();
	}
	
	/**
	 * 描述：表格数据修改
	 * 责任人：
	 * 创建时间：
	 */
	public int updateSimpleObject(SimpleObjectDO updateDO){
		return (Integer) this.update("updateSimpleObject", updateDO);
	}
	
	/**
	 * 描述：表格数据删除
	 * 责任人：
	 * 创建时间：
	 */
	public int deleteSimpleObject(SimpleObjectDO deleteDO){
		return (Integer) this.delete("deleteSimpleObject", deleteDO);
	}
	
}
