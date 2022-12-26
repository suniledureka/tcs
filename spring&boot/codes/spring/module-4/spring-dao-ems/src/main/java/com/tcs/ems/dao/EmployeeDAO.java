package com.tcs.ems.dao;

import java.util.List;

import com.tcs.ems.dto.Employee;

public interface EmployeeDAO {
	Integer saveEmployee(Employee emp);
	
	Integer updateEmployee(int eno, Employee emp);
	
	Integer deleteEmployeeByNo(int eno);
	
	Employee findEmployeeByNo(int eno);
	
	List<Employee> findAll();
}
