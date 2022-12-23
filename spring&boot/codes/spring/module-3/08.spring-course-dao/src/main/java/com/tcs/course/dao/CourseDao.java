package com.tcs.course.dao;

import java.util.List;

import com.tcs.course.entity.Course;

public interface CourseDao {
	public void saveCourse(Course course);	
	
	public List<Course> findAllCourses();
}
