package com.qhit.hl.grl.ltz.common.bean;

public class Teacher {
	private int tid;
	private String tname;
	private String sex;
	private String birhday;
	private String education;
	private String tel;
	private String post;
	private String remarks;
	
	//单向1 - 1
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public Teacher(){
		
	}

	public Teacher(String tname, String sex, String post) {
		super();
		this.tname = tname;
		this.sex = sex;
		this.post = post;
	}

	public Teacher(String tname, String sex, String birhday, String education,
			String tel, String post, String remarks) {
		super();
		this.tname = tname;
		this.sex = sex;
		this.birhday = birhday;
		this.education = education;
		this.tel = tel;
		this.post = post;
		this.remarks = remarks;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirhday() {
		return birhday;
	}

	public void setBirhday(String birhday) {
		this.birhday = birhday;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	

}
