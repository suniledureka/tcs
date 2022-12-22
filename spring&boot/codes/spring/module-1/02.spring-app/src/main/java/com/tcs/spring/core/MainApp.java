package com.tcs.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.core.beans.User;

public class MainApp {

	public static void main(String[] args) {
		//-- initialize spring container / IoC
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		System.out.println("-------------------------------------------------------------");
		
		User usr1 = (User) context.getBean("user1");
		System.out.println(usr1);
		
		System.out.println("-------------------------------------------------------------");		
		
		User usr2 = (User) context.getBean("user1");
		System.out.println(usr2);
		
		System.out.println("-------------------------------------------------------------");		
		
		User usr3 = (User) context.getBean("user1");
		System.out.println(usr3);
		
		System.out.println("-------------------------------------------------------------");	
		
		User usr4 = context.getBean("user2", User.class);
		System.out.println(usr4);
	}

}
