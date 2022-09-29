package com.cms.dao;

import java.util.List;

import com.cms.bean.Course;
import com.cms.exceptions.CourseException;

public interface CourseDao {
	
	//create course
	public String createCourse(Course course);
	
	
	//update course by name
	public String upadteCourseByName();
	
	
	//view all courses details
	public List<Course> viewAllCourseDetails()throws CourseException;

}
