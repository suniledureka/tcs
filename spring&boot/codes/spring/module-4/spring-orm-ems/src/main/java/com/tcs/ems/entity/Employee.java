package com.tcs.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@Column(name = "empno")
	private Integer employeeNo;
	
	@Column(name = "ename")
	private String employeeName;
	
	@Column(name = "sal")
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
