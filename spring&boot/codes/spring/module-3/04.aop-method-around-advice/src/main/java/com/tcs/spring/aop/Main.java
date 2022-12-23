package com.tcs.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.aop.beans.SampleBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-beans.xml");		
		
		SampleBean bean = (SampleBean)context.getBean("proxy");
		
		bean.actualLogicMethod();
		
		System.out.println("----------------------------------------------------");
		
		bean.depositAmount("SBI12000534", 55000f);
	}
}