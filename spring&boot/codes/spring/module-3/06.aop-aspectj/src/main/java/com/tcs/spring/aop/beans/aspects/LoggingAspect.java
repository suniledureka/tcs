package com.tcs.spring.aop.beans.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution(* com.tcs.spring.aop.beans.Account.*(..))")
	public void logBefore(JoinPoint jp) {
		System.out.println("###--- log message before the execution of method --- " + jp.toString() + "###");
	}

	@AfterReturning("execution(* com.tcs.spring.aop.beans.*.*(..))")
	public void notifyService() {
		System.out.println("@@@--- sending a notification after the succesfull execution of method ---###");
	}
}
