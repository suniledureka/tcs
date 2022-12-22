package com.tcs.spring.core;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.core.beans.Hospital;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hospital-beans.xml");
		
		Hospital hosp = (Hospital)context.getBean("apollo");
		
		System.out.println("hospital name = " + hosp.getHospitalName());
		
		Set<String> depts = hosp.getDepartments();
		
		System.out.println("Department Names ===> ");
		for(String dept : depts) {
			System.out.println("\t -----> " + dept);
		}
	}
}
