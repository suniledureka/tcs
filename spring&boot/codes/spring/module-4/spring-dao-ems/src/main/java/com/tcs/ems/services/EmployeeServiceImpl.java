package com.tcs.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.ems.dao.EmployeeDAO;
import com.tcs.ems.dto.Employee;


public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	public void saveEmployee(Employee emp) {
		int employeesSaved = dao.saveEmployee(emp);
		if(employeesSaved > 0)
			System.out.println("$$$---- Employee Saved ----$$$");
	}

	public void updateEmployee(int eno, Employee emp) {
		int employeesUpdated = dao.updateEmployee(eno, emp);
		if(employeesUpdated > 0)
			System.out.println("$$$---- Employee Updated ----$$$");
		else
			System.out.println("$$$---- No Employee got Updated ----$$$");
	}

	public void deleteEmployeeByNo(int eno) {
		int employeesDeleted = dao.deleteEmployeeByNo(eno);
		if(employeesDeleted > 0)
			System.out.println("$$$---- Employee Deleted ----$$$$");
		else
			System.out.println("$$$---- No Matching Employee to Delete");
	}

	public Employee searchEmployeeByNo(int eno) {
		return dao.findEmployeeByNo(eno);
	}

	public void getAllEmployees() {
		List<Employee> employees = dao.findAll();
		for(Employee emp : employees) {
			System.out.println(emp);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
	}

}
