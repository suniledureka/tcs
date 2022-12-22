package com.tcs.spring.core;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.core.beans.Customer;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("shopping-cart-beans.xml");
		
		Customer customer = (Customer)context.getBean("cust-1");
		
		System.out.println("Customer ID= " + customer.getCustomerId());
		System.out.println("Customer Name= " + customer.getCustomerName());
		
		System.out.println("Customer's Cart Contains: ");
		Map<String, Integer> entries = customer.getProducts();
		
		Set<String> keys = entries.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Integer value = entries.get(key);
			
			String entry = String.format("%-10s ----> %2d", key, value);
			System.out.println(entry);
		}
	}

}
