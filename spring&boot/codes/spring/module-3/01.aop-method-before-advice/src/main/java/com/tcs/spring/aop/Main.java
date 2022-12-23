package com.tcs.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.aop.beans.Account;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-beans.xml");
		
		//Account acc = (Account)context.getBean("account");
		Account acc = (Account)context.getBean("proxy");
		
		acc.deposit();
		System.out.println("------------------------------------------------------------------\n");
		
		acc.deposit("SBI8748596547", 2500f);
	}

}
