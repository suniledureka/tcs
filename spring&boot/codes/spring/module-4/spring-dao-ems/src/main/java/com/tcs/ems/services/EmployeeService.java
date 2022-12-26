package com.tcs.ems.services;

import com.tcs.ems.dto.Employee;

public interface EmployeeService {
	void saveEmployee(Employee emp);
	
	void updateEmployee(int eno, Employee emp);
	
	void deleteEmployeeByNo(int eno);
	
	Employee searchEmployeeByNo(int eno);
	
	void getAllEmployees();
}
