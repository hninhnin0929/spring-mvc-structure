package com.webservice.models;

public class User {
	
	private String syskey;
	private String createdDate;
	private String modifiedDate;
	private String userId;
	private String userName;
	private String password;
	private String userSyskey;

	public User() {
		super();
		this.syskey = "0";
		this.createdDate = "";
		this.modifiedDate = "";
		this.userId = "";
		this.userName = "";
		this.password = "";
		this.userSyskey = "0";
	}

	public String getSyskey() {
		return syskey;
	}
	public void setSyskey(String syskey) {
		this.syskey = syskey;
	}
	
	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserSyskey() {
		return userSyskey;
	}

	public void setUserSyskey(String userSyskey) {
		this.userSyskey = userSyskey;
	}
}
