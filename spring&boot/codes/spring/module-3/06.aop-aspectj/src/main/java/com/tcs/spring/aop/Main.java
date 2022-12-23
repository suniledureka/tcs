package com.tcs.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.aop.beans.Account;
import com.tcs.spring.aop.beans.SampleBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-beans.xml");
		
		Account acc = (Account)context.getBean("account");
		
		acc.deposit();
		System.out.println("==========================================================");
		
		acc.deposit("BOA12000514", 25000f);
		
		System.out.println("==========================================================");
		
		SampleBean sample = (SampleBean)context.getBean("sb");
		sample.testMethod();
	}

}
