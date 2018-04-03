package com.qhit.hl.grl.ltz.tkgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.hl.grl.ltz.common.bean.PageBean;
import com.qhit.hl.grl.ltz.kmgl.bean.Course;
import com.qhit.hl.grl.ltz.tkgl.bean.WrittenQuestion;

public interface QuestionService {
	
	/**
	 * 获取题目数
	 * @param csId
	 * @param qtype
	 * @param degree
	 * @return
	 */
	public int getQuestionMax(int csId ,String qtype , String degree);
	
	/**
	 * 题库管理
	 * @param patameter
	 * @return
	 * 题库列表
	 */
	public List<Course> getCourseInfo(Map patameter);
	
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean,
			Course course,
			int pageIndex);

}
