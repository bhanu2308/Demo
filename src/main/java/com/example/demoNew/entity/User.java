package com.example.demoNew.entity;

public class User {
	private String gender;
	private String name;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(String gender,String name) {
		this.gender = gender;
		this.name = name;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
