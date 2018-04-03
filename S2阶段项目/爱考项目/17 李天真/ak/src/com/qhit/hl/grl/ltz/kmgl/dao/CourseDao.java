package com.qhit.hl.grl.ltz.kmgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.hl.grl.ltz.kmgl.bean.Course;

public interface CourseDao {
	/**
	 * 
	 * @param patamater
	 * @return
	 */
	public List<Course> getCourseList(Map<String ,Object> patamater);

}
