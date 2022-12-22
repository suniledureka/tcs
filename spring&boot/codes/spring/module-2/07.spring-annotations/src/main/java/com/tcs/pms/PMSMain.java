package com.tcs.pms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.pms.beans.repository.ProductRepository;

public class PMSMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("pms-beans.xml");
		System.out.println();
		
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		for(String name : beanNames) {
			System.out.println("-----> " + name);
		}
		System.out.println();
		
		//ProductRepository repo = (ProductRepository)context.getBean("productRepository");
		ProductRepository repo = (ProductRepository)context.getBean("pmsRepo");
		repo.saveProduct();
	}

}
