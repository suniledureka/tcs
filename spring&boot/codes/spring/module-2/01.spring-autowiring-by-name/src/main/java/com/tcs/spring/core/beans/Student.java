package com.tcs.spring.core.beans;

public class Student {
	private Integer studentId;
	private String studentName;
	private Hostel studentHostel;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Hostel getStudentHostel() {
		return studentHostel;
	}

	public void setStudentHostel(Hostel studentHostel) {
		this.studentHostel = studentHostel;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}
