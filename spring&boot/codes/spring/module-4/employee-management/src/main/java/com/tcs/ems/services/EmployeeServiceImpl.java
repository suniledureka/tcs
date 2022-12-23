package com.tcs.ems.services;

import java.util.List;

import com.tcs.ems.dao.EmployeeDAO;
import com.tcs.ems.dao.EmployeeDAOImpl;
import com.tcs.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private static EmployeeDAO dao = null;
	
	public EmployeeServiceImpl() throws Exception{
		dao = new EmployeeDAOImpl();
	}

	public void saveEmployee(Employee emp) throws Exception {
		int employeesSaved = dao.saveEmployee(emp);
		if(employeesSaved > 0)
			System.out.println("$$$---- Employee Saved ----$$$");
	}

	public void updateEmployee(int eno, Employee emp) throws Exception {
		int employeesUpdated = dao.updateEmployee(eno, emp);
		if(employeesUpdated > 0)
			System.out.println("$$$---- Employee Updated ----$$$");
		else
			System.out.println("$$$---- No Employee got Updated ----$$$");
	}

	public void deleteEmployeeByNo(int eno) throws Exception {
		int employeesDeleted = dao.deleteEmployeeByNo(eno);
		if(employeesDeleted > 0)
			System.out.println("$$$---- Employee Deleted ----$$$$");
		else
			System.out.println("$$$---- No Matching Employee to Delete");
	}

	public Employee searchEmployeeByNo(int eno) throws Exception {
		return dao.findEmployeeByNo(eno);
	}

	public void getAllEmployees() throws Exception {
		List<Employee> employees = dao.findAll();
		for(Employee emp : employees) {
			System.out.println(emp);
			Thread.sleep(1000);
		}
	}

}
