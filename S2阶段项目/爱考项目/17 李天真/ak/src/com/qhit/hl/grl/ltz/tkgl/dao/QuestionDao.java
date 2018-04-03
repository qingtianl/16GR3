package com.qhit.hl.grl.ltz.tkgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.hl.grl.ltz.common.bean.PageBean;
import com.qhit.hl.grl.ltz.kmgl.bean.Course;
import com.qhit.hl.grl.ltz.tkgl.bean.WrittenQuestion;

public interface QuestionDao {
	
	/**
	 * 获取题目数
	 * @param csId
	 * @param qtype
	 * @param degree
	 * @return
	 */
	public int getQuestionMax(int csId ,String qtype ,String degree);
	/**
	 * 题库管理
	 * @param paratemer
	 * @return
	 * 题库列表
	 */
	public List<Course> getCourseInfo(Map parameter);
	
	/**
	 * 笔试列表分页数据
	 * @param pageBean
	 * @param course
	 * @param pgeIndex
	 * @return
	 */
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean,
			Course course,
			int pageIndex);
	
	/**
	 * 添加笔试题
	 * @param writtenQuestion
	 */
	public void addWrittenQuestion(WrittenQuestion writtenQuestion);
	
	/**
	 * 根据ID查询试题
	 * @param writtenQuestion
	 * @return
	 */
	public WrittenQuestion getWrittenQuestionById(WrittenQuestion writtenQuestion);
	
	/**
	 * 更新数据
	 * @param writtenQuestion
	 */
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion);
	
	/**
	 * 批量导入笔试题
	 * @param listWrittenQuestion
	 */
	public void inportWrittenQuestion(List<WrittenQuestion> listWrittenQuestion);

}
