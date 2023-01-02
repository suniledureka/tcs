package com.tcs.irctc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "IRCTC API", version = "2.0", description = "Ticket Booking Application"))
public class Application {
	//static TicketRepository ticketRepo;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		//ticketRepo = context.getBean(TicketRepository.class);
	}

}
