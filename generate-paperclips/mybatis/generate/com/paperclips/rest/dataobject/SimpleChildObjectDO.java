package com.paperclips.rest.dataobject;

import java.io.Serializable;

import com.paperclips.rest.common.base.AbstractDO;

/**
 * @author auto
 * @version 
 * @description 
 * @copyright  
 */
public class SimpleChildObjectDO  extends AbstractDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String simpleObjectId;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSimpleObjectId() {
		return simpleObjectId;
	}

	public void setSimpleObjectId(String simpleObjectId) {
		this.simpleObjectId = simpleObjectId;
	}
	

}
