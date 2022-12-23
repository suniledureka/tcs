package com.tcs.spring.aop.beans.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("$$$-- here we can write the logic that to be executed before the execution of --$$$");
		System.out.println("Method = "+method.getName()+"()");
		System.out.println("No of Parameters =  "+ args.length);
		System.out.println("Object Type = " + target.getClass().getName());
	}

}
