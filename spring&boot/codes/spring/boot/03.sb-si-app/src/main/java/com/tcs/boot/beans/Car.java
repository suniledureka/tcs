package com.tcs.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine engine;
	
	public Car() {
		System.out.println("Car :: Constructor");		
	}	
	
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public void startJourney() {
		boolean engineStatus = engine.startEngine();
		if(engineStatus)
			System.out.println("$$$--- Happy Journey ---$$$");
		else
			System.out.println("$$$--- Journey Cancelled ---$$$");
	}

}
