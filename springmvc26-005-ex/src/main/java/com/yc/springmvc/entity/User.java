package com.yc.springmvc.entity;

public class User {
	private Integer id;
	private String uname;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

	public User(Integer id, String uname, String password) {
		this.id = id;
		this.uname = uname;
		this.password = password;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", password=" + password + "]";
	}
}
