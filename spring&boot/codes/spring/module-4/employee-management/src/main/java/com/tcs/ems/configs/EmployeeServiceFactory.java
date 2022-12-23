package com.tcs.ems.configs;

import com.tcs.ems.services.EmployeeService;
import com.tcs.ems.services.EmployeeServiceImpl;

public class EmployeeServiceFactory {
	private static EmployeeService empService = null;
	
	public static EmployeeService getEmployeeService() throws Exception{
		if(empService == null) {
			empService = new EmployeeServiceImpl();
		}
		return empService;
	}
}
