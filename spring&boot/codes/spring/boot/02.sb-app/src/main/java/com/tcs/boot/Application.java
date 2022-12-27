package com.tcs.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tcs.boot.beans.Car;
import com.tcs.boot.beans.Ticket;
import com.tcs.boot.utils.PasswordEncoder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Application.class, args);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		int beansCount = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + beansCount);
		System.out.println("---------------------------------------------------------------------------------");
		
		Car carObj1 = context.getBean(Car.class);
		carObj1.startJourney();
		System.out.println("---------------------------------------------------------------------------------");
		
		//Car carObj2 = (Car) context.getBean("car");
		Car carObj2 = (Car) context.getBean("mycar");
		carObj2.startJourney();			
		System.out.println("---------------------------------------------------------------------------------");
		
		//Car carObj3 = context.getBean("car", Car.class);
		Car carObj3 = context.getBean("mycar", Car.class);
		carObj3.startJourney();		
		
		System.out.println("---------------------------------------------------------------------------------");
		
		//PasswordEncoder encoder = context.getBean(PasswordEncoder.class);
		//PasswordEncoder encoder = (PasswordEncoder) context.getBean("getPwdEncoder");
		//PasswordEncoder encoder = (PasswordEncoder) context.getBean("encoder");
		PasswordEncoder encoder = (PasswordEncoder) context.getBean("security");
		String pwd = "11pa$$w0rd22";
		String epwd = encoder.encryptData(pwd);
		System.out.println("encrypted data = " + epwd);
		System.out.println("---------------------------------------------------------------------------------");
		
		Ticket tkt = context.getBean(Ticket.class);
		System.out.println(tkt);
	}
}