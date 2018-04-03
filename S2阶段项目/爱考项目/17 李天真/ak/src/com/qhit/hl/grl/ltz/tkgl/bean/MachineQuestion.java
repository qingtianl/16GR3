package com.qhit.hl.grl.ltz.tkgl.bean;

import com.qhit.hl.grl.ltz.kmgl.bean.Course;

public class MachineQuestion implements java.io.Serializable {
	// Fields

		private Integer qid;
		private String qtitle;
		private String degree;
		private Integer qsId;
		private String chapter;
		
		//n-1
		private Course course;

		public MachineQuestion(Course course) {
			super();
			this.course = course;
		}
		public MachineQuestion(){
			
		}
		public MachineQuestion(String qtitle, String degree, Integer qsId) {
			super();
			this.qtitle = qtitle;
			this.degree = degree;
			this.qsId = qsId;
		}
		public MachineQuestion(String qtitle, String degree, Integer qsId,
				String chapter) {
			super();
			this.qtitle = qtitle;
			this.degree = degree;
			this.qsId = qsId;
			this.chapter = chapter;
		}
		public Integer getQid() {
			return qid;
		}
		public void setQid(Integer qid) {
			this.qid = qid;
		}
		public String getQtitle() {
			return qtitle;
		}
		public void setQtitle(String qtitle) {
			this.qtitle = qtitle;
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
		public Course getCourse() {
			return course;
		}
		public void setCourse(Course course) {
			this.course = course;
		}
		

}
