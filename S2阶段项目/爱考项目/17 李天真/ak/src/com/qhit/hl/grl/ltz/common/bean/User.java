package com.qhit.hl.grl.ltz.common.bean;

public class User {
	//private int uid;
	private String name;
	private String pwd;
	private int role;
	
	public User(){
		
	}

	public User(String pwd, int role) {
		super();
		this.pwd = pwd;
		this.role = role;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	

}
