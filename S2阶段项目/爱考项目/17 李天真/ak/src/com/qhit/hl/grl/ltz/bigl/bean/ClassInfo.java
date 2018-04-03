package com.qhit.hl.grl.ltz.bigl.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.qhit.hl.grl.ltz.common.bean.Student;



//import java.io.Serializable;

public class ClassInfo implements java.io.Serializable {
	//Fields
	private String ccode;
	private String cname;
	private String major;
	private Integer insId;
	private Integer iecId;
	private Date cdate;
	private Integer g1num;
	private Integer g2num;
	private Integer g3num;
	private Integer csId;
	private String cremark;
	
	//1-n
	private Set<Student> student = new HashSet<>();

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	//default constructor
	public ClassInfo(){
		
	}

	public ClassInfo(String cname, String major, Integer insId, Integer iecId,
			Date cdate) {
		super();
		this.cname = cname;
		this.major = major;
		this.insId = insId;
		this.iecId = iecId;
		this.cdate = cdate;
	}

	public ClassInfo(String cname, String major, Integer insId, Integer iecId,
			Date cdate, Integer g1num, Integer g2num, Integer g3num,
			Integer csId, String cremark, Set<Student> student) {
		super();
		this.cname = cname;
		this.major = major;
		this.insId = insId;
		this.iecId = iecId;
		this.cdate = cdate;
		this.g1num = g1num;
		this.g2num = g2num;
		this.g3num = g3num;
		this.csId = csId;
		this.cremark = cremark;
		this.student = student;
	}

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Integer getInsId() {
		return insId;
	}

	public void setInsId(Integer insId) {
		this.insId = insId;
	}

	public Integer getIecId() {
		return iecId;
	}

	public void setIecId(Integer iecId) {
		this.iecId = iecId;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Integer getG1num() {
		return g1num;
	}

	public void setG1num(Integer g1num) {
		this.g1num = g1num;
	}

	public Integer getG2num() {
		return g2num;
	}

	public void setG2num(Integer g2num) {
		this.g2num = g2num;
	}

	public Integer getG3num() {
		return g3num;
	}

	public void setG3num(Integer g3num) {
		this.g3num = g3num;
	}

	public Integer getCsId() {
		return csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public String getCremark() {
		return cremark;
	}

	public void setCremark(String cremark) {
		this.cremark = cremark;
	}
	
}
