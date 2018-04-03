package com.qhit.hl.grl.ltz.kmgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.hl.grl.ltz.kmgl.bean.Course;
import com.qhit.hl.grl.ltz.kmgl.dao.CourseDao;
import com.qhit.hl.grl.ltz.kmgl.dao.CourseDaoImpl;

public class CourseServiceImpl implements CourseService {
	private CourseDao courseDao = new CourseDaoImpl();

	@Override
	public List<Course> getCourseList(Map<String, Object> parameter) {
		// TODO Auto-generated method stub
		return courseDao.getCourseList(parameter);
	}

}
