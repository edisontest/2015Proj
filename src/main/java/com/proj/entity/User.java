package com.proj.entity;

/**
* <UserEntity>
*		
* @author: Administrator
* @version: 1.0, 2015年9月22日
*/
public class User {
	private Integer	id;
	private String	name;
	private String	age;
	private String	addr;
	private String	gender;



	public Integer getId() {
		return id;
	}



	public void setId(Integer pId) {
		id = pId;
	}



	public String getName() {
		return name;
	}



	public void setName(String pName) {
		name = pName;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String pAge) {
		age = pAge;
	}



	public String getAddr() {
		return addr;
	}



	public void setAddr(String pAddr) {
		addr = pAddr;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String pGender) {
		gender = pGender;
	}



	public User() {
		super();
	}

}
