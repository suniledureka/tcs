package com.tcs.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//-- initialize spring container / IoC
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		System.out.println("-------------------------------------------------------------");
		
		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + noOfBeans);
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("Bean Names Configured ===> ");
		String[] beanNames = context.getBeanDefinitionNames();
		
		for(String beanName : beanNames) {
			System.out.println("\t -------> "+ beanName);
		}
	}

}
