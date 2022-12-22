package com.tcs.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.core.beans.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student-beans.xml");

		Student st1 = (Student)context.getBean("stud1");
		System.out.println(st1);
		
		System.out.println("----------------------------------------------------------");
		
		Student st2 = (Student)context.getBean("stud2");
		System.out.println(st2);		
	}

}
