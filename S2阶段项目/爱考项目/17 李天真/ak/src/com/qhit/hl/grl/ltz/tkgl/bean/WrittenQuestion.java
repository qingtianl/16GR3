package com.qhit.hl.grl.ltz.tkgl.bean;

import com.qhit.hl.grl.ltz.kmgl.bean.Course;

public class WrittenQuestion implements java.io.Serializable {

	// Fields

	private Integer qid;
	private String qtype;
	private String qtitle;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String answer;
	private String degree;
	private Integer qsId;
	private String chapter;
	
	//n-1
	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	public WrittenQuestion(){
		
	}

	public WrittenQuestion(String qtype, String qtitle, String optionA,
			String optionB, String optionC, String optionD, String degree,
			Integer qsId, String chapter) {
		super();
		this.qtype = qtype;
		this.qtitle = qtitle;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.degree = degree;
		this.qsId = qsId;
		this.chapter = chapter;
	}

	public WrittenQuestion(String qtype, String qtitle, String optionA,
			String optionB, String optionC, String optionD, String answer,
			String degree, Integer qsId) {
		super();
		this.qtype = qtype;
		this.qtitle = qtitle;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
		this.degree = degree;
		this.qsId = qsId;
	}

	public Integer getQid() {
		return qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	public String getQtitle() {
		return qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Integer getQsId() {
		return qsId;
	}

	public void setQsId(Integer qsId) {
		this.qsId = qsId;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	

}
