package com.tcs.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.core.beans.Employee;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-address-beans.xml");
		
		//Employee emp = (Employee)context.getBean("empl-1");
		Employee emp = (Employee)context.getBean("sunil");
		System.out.println(emp);
		System.out.println(emp.getEmployeeAddress());
		
		System.out.println("------------------------------------------------------------------");
	}
}
