package com.tcs.spring.aop.beans.aspects;

public class Logger {
	public void log() {
		System.out.println("LOG: Going to deposit amount");
	}
	
	public void notifyService() {
		System.out.println("--sending sms ---");
	}
}
