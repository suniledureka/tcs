package com.tcs.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.core.beans.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student-beans.xml");
		
		Student student = (Student)context.getBean("stud");
		System.out.println(student);
		
		//System.out.println(Integer.MAX_VALUE);
	}

}
