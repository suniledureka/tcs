package com.tcs.spring.core.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private Integer studentAdmNo;
	
	@Value("TCS_1001")
	private String studentId;
	
	@Value("${student.name}")
	private String studentName;
	
	@Value("#{courses}")
	private List<String> studentCourses;

	public Integer getStudentAdmNo() {
		return studentAdmNo;
	}

	public void setStudentAdmNo(Integer studentAdmNo) {
		this.studentAdmNo = studentAdmNo;
	}

	public String getStudentId() {
		return studentId;
	}


	public String getStudentName() {
		return studentName;
	}
	
	@Required
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(List<String> studentCourses) {
		this.studentCourses = studentCourses;
	}

	@Override
	public String toString() {
		return "Student [studentAdmNo=" + studentAdmNo + ", studentId=" + studentId + ", studentName=" + studentName
				+ ", studentCourses=" + studentCourses + "]";
	}

}
