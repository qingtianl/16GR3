package com.qhit.hl.grl.ltz.kmgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.hl.grl.ltz.kmgl.bean.Course;

public interface CourseService {
	/**
	 * 
	 * @param patameter
	 * @return
	 */
	public List<Course> getCourseList(Map<String ,Object> patameter);

}
