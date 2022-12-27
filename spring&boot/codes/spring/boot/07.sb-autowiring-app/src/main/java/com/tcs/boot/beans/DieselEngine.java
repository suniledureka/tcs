package com.tcs.boot.beans;

import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DieselEngine implements Engine {

	@Override
	public boolean startEngine() {
		System.out.println("###--- Starting Diesel Engine ---###");
		boolean status = new Random().nextBoolean();
		return status;
	}

}
