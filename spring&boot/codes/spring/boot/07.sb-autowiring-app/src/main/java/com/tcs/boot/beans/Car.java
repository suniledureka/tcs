package com.tcs.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	@Qualifier("petrolEngine")	
	private Engine engine;	

	public void startJourney() {
		boolean engineStatus = engine.startEngine();
		if(engineStatus)
			System.out.println("$$$--- Happy Journey ---$$$");
		else
			System.out.println("$$$--- Journey Cancelled ---$$$");
	}

}
