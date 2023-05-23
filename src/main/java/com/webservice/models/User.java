package com.webservice.models;

public class User {
	
	private String syskey;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	
	public User() {
		super();
		this.syskey = "";
		this.userName = "";
		this.firstName = "";
		this.lastName = "";
		this.password = "";
	}

	public String getSyskey() {
		return syskey;
	}

	public void setSyskey(String syskey) {
		this.syskey = syskey;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
