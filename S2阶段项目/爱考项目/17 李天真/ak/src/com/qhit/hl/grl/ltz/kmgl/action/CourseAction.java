package com.qhit.hl.grl.ltz.kmgl.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.hl.grl.ltz.kmgl.bean.Course;
import com.qhit.hl.grl.ltz.kmgl.service.CourseService;
import com.qhit.hl.grl.ltz.kmgl.service.CourseServiceImpl;

public class CourseAction extends ActionSupport {
	private static final long serialVersionUID = 5352074026213567264L;
	private CourseService courseService = new CourseServiceImpl();
	private List<Course> listCourses = new ArrayList<>();
	private Course course;
	
	public String getCourses2Json() {
		//设置参数
		Map<String ,Object> parameter = new HashMap<>();
		if(course != null) {
			parameter.put("major", course.getMajor());
			parameter.put("stage", course.getStage());
		}
		//查询题库列表顺序
		listCourses = courseService.getCourseList(parameter);
		System.out.println("异步请求:" + listCourses.size());
		return "listCourseJson";
	}
	public List<Course> getListCourse(){
		return listCourses;
		
	}
	public Course getCourse() {
		return course;
		
	}
	public void setListCourse(List<Course> Courses) {
		this.listCourses = listCourses;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

}
