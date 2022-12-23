package com.tcs.spring.aop.beans.aspects;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvisor implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		System.out.println(".... if exception occurs this method gets executed ...");
	}
}
