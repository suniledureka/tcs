package com.tcs.ems;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.ems.dao.EmployeeDAO;
import com.tcs.ems.entity.Employee;

public class EMSMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ems-beans.xml");

		EmployeeDAO dao=(EmployeeDAO)context.getBean("empdao");
		
		/*
		Employee e=new Employee(106,"Shilpa",4500.50f);
		dao.saveEmployee(e);
		*/
		
		List<Employee> emps = dao.findAllEmployees();
		for(Employee emp : emps) {
			System.out.println(emp);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
		
		((ConfigurableApplicationContext)context).close();
	}

}
