package com.tcs.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.beans.UsingSpEl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		UsingSpEl bean = (UsingSpEl)context.getBean("spel");
		
		System.out.println(bean.isEqualCheck());
		
		System.out.println(bean.getConcat());
		
		System.out.println(bean.getExponent());
	}

}
