package com.tcs.spring.aop.beans.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj ;
		System.out.println("$$$--- cross concern for before execution of "+ invocation.getMethod().getName()+"() ---$$$");
		
		obj = invocation.proceed();
		
		System.out.println("$$$--- cross concern for after execution of "+ invocation.getMethod().getName()+"() ---$$$");
		return obj;
	}

}
