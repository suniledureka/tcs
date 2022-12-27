package com.tcs.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine :: Constructor");
	}
	
	public boolean startEngine() {
		boolean status = new Random().nextBoolean();
		return status;
	}
}
