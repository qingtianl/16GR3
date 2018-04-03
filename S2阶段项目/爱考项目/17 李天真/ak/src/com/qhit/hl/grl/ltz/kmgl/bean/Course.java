package com.qhit.hl.grl.ltz.kmgl.bean;

import java.util.HashSet;
import java.util.Set;

import com.qhit.hl.grl.ltz.tkgl.bean.MachineQuestion;
import com.qhit.hl.grl.ltz.tkgl.bean.WrittenQuestion;

public class Course implements java.io.Serializable {
	private Integer csId;
	private String csName;
	private String stage;
	private String major;
	
	//1-n
	private Set<MachineQuestion> machineTests = new HashSet<>();
	private Set<WrittenQuestion> writtenTests = new HashSet<>();
	public Set<MachineQuestion> getMachineTests() {
		return machineTests;
	}
	public void setMachineTests(Set<MachineQuestion> machineTests) {
		this.machineTests = machineTests;
	}
	public Set<WrittenQuestion> getWrittenTests() {
		return writtenTests;
	}
	public void setWrittenTests(Set<WrittenQuestion> writtenTests) {
		this.writtenTests = writtenTests;
	}
	public Course(){
		
	}
	public Course(String csName, String stage) {
		super();
		this.csName = csName;
		this.stage = stage;
	}
	public Course(Integer csId, String csName, String stage, String major) {
		super();
		this.csId = csId;
		this.csName = csName;
		this.stage = stage;
		this.major = major;
	}
	public Integer getCsId() {
		return csId;
	}
	public void setCsId(Integer csId) {
		this.csId = csId;
	}
	public String getCsName() {
		return csName;
	}
	public void setCsName(String csName) {
		this.csName = csName;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	

}
