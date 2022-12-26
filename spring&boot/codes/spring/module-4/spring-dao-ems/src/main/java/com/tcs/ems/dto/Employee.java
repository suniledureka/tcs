package com.tcs.ems.dto;

public class Employee {
	private Integer employeeNo;
	private String employeeName;
	private Float employeeSal;

	public Employee() {	}

	public Employee(Integer employeeNo, String employeeName, Float employeeSal) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeeSal = employeeSal;
	}

	public Integer getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(Integer employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Float getEmployeeSal() {
		return employeeSal;
	}

	public void setEmployeeSal(Float employeeSal) {
		this.employeeSal = employeeSal;
	}

	@Override
	public String toString() {
		return "Employee [" + employeeNo + " | " + employeeName + " | " + employeeSal + "]";
	}

}
