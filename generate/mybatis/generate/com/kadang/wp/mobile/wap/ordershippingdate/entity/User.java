package com.kadang.wp.mobile.wap.ordershippingdate.entity;


import com.kadang.wp.mobile.common.base.BaseDto;

/**
 * @author auto
 * @version 
 * @description 
 * @copyright  
 */
public class User extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mobile;
	private String nickName;
	private String email;
	private String avatar;
	private Integer birthday;
	private String gender;
	private Byte level;
	private Byte loveState;
	private Byte isDisable;
	private Integer createTime;
	private Integer lastLogin;


	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getBirthday() {
		return birthday;
	}

	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Byte getLevel() {
		return level;
	}

	public void setLevel(Byte level) {
		this.level = level;
	}

	public Byte getLoveState() {
		return loveState;
	}

	public void setLoveState(Byte loveState) {
		this.loveState = loveState;
	}

	public Byte getIsDisable() {
		return isDisable;
	}

	public void setIsDisable(Byte isDisable) {
		this.isDisable = isDisable;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Integer lastLogin) {
		this.lastLogin = lastLogin;
	}
	

}
