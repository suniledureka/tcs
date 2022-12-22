package com.tcs.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.core.beans.Customer;

public class MainApp {

	public static void main(String[] args) {
		//-- initialize spring container / IoC
		ApplicationContext context = new ClassPathXmlApplicationContext("customer-beans.xml");	
		
		
		Customer cust1 = (Customer)context.getBean("sanjay");
		System.out.println(cust1.getName()+", owns a "+ cust1.getCar().getModel()+" car, which costs Rs."+cust1.getCar().getCost());
		
		System.out.println("-------------------------------------------------------------");	
		
		Customer cust2 = (Customer)context.getBean("kapil");
		System.out.println(cust2.getName()+", owns a "+ cust2.getCar().getModel()+" car, which costs Rs."+cust2.getCar().getCost());		
	}

}
