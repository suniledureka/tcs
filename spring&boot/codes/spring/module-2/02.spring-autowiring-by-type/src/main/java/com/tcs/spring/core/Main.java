package com.tcs.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.core.beans.Hostel;
import com.tcs.spring.core.beans.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student-hostel-beans.xml");
		
		Student st = (Student)context.getBean("stud");
		
		System.out.println(st);
		
		Hostel hostel = st.getStudentHostel();
		System.out.println(hostel);

	}

}
