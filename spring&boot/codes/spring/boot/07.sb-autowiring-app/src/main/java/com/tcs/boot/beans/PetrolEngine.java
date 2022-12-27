package com.tcs.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine {

	@Override
	public boolean startEngine() {
		System.out.println("###--- Starting Petrol Engine ---###");
		boolean status = new Random().nextBoolean();
		return status;
	}

}
