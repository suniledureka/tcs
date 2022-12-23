package com.tcs.course.entity;

public class Course {
	private Integer courseId;
	private String courseName;
	private Float coursePrice;

	public Course() {}

	public Course(Integer courseId, String courseName, Float coursePrice) {		
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Float getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(Float coursePrice) {
		this.coursePrice = coursePrice;
	}

	@Override
	public String toString() {
		return "Course [Course ID= " + courseId + " | Course Name= " + courseName + " | Course Price= " + coursePrice + "]";
	}
}
