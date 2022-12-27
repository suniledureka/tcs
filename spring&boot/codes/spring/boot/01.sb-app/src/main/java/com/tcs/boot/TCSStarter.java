package com.tcs.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TCSStarter {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(Application.class, args);
		
		System.out.println("---------------------------------------------------------------------------------");
		int beansCount = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + beansCount);
		System.out.println("---------------------------------------------------------------------------------");
	}

}
