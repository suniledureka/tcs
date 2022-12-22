package com.tcs.spring.autowire.beans;

public class Student {
	private Integer studId;
	private String studName;
	private Hostel studHostel;
	
	
	public Student(Integer studId, String studName, Hostel studHostel) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studHostel = studHostel;
	}

	public Hostel getStudHostel() {
		return studHostel;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + " | studName=" + studName + "]";
	}
}
