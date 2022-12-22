package com.tcs.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student-beans.xml");
		
		System.out.println("------------------------------------------------");
		
		//((ConfigurableApplicationContext)context).close();
		//((AbstractApplicationContext)context).close();
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
