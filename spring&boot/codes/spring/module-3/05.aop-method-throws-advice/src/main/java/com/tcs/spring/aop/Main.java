package com.tcs.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.spring.aop.beans.AuthenticatePassword;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-beans.xml");
		
		AuthenticatePassword pwdAuth = (AuthenticatePassword)context.getBean("proxy");
		
		//String password = "mypassword";
		String password = "mypass";
		boolean pwdStatus = false;
		
		try {
			pwdStatus = pwdAuth.validatePassword(password);
		}catch(Exception ex) {
			System.out.println("--- in catch block ----");
			System.out.println(ex.toString());
		}
		
		System.out.println("is password validated = " + pwdStatus);
	}

}
