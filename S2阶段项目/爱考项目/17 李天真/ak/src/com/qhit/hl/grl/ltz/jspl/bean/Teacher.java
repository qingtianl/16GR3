package com.qhit.hl.grl.ltz.jspl.bean;

import java.util.Date;

import com.qhit.hl.grl.ltz.common.bean.User;

public class Teacher {
	private String tid;
	private String tname;
	private String sex;
	private Date birthday;
	private String education;
	private String tel;
	private String post;
	private String remarks;
	
	//单项1-1
	private User user;
	
	public Teacher() {
		
	}

	public Teacher(String tname, String sex, String post) {
		super();
		this.tname = tname;
		this.sex = sex;
		this.post = post;
	}

	public Teacher(String tname, String sex, Date birthday, String education, String tel, String post, String remarks,
			User user) {
		super();
		this.tname = tname;
		this.sex = sex;
		this.birthday = birthday;
		this.education = education;
		this.tel = tel;
		this.post = post;
		this.remarks = remarks;
		this.user = user;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
