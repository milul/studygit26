package com.yc.us.entity;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String birthday;
	private String gender;
	private String career;
	private String address;
	private String mobile;
	private String picPath;
	private Integer flag;
	
	public User() {
	}
	

	public User(String name, String birthday, String gender, String career,
			String address, String mobile, String picPath, Integer flag) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.career = career;
		this.address = address;
		this.mobile = mobile;
		this.picPath = picPath;
		this.flag = flag;
	}


	public Integer getFlag() {
		return flag;
	}


	public void setFlag(Integer flag) {
		this.flag = flag;
	}


	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public	Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday
				+ ", gender=" + gender + ", career=" + career + ", address="
				+ address + ", mobile=" + mobile + ", picPath=" + picPath
				+ ", flag=" + flag + "]";
	}
}
