package com.tcs.spring.aop.beans.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvisor implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("####-- here we write the logic to be executed after the execution of --####");
		System.out.println("Method Name = " + method.getName()+"()");
		System.out.println("No of Parameters = " + args.length);
		System.out.println("Return Value = " + returnValue);
		if(returnValue != null) {
			System.out.println("Return Type = " + returnValue.getClass().getName());
		}else {
			System.out.println("Return Type = Void");
		}
		System.out.println("Object Type = " + target.getClass().getName());				
	}	
}
