package com.tcs.irctc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.irctc.bindings.Passenger;
import com.tcs.irctc.bindings.Ticket;

@RestController
@RequestMapping("/irctc")
public class TicketRestController {
	@PostMapping(value = "/ticket/new",
			     consumes = {"application/json", "application/xml"},
			     produces = {"application/json", "application/xml"})
	public ResponseEntity<?> bookNewTicket(@RequestBody Passenger passenger){
		System.out.println(passenger);
		
		Ticket ticket = new Ticket();
		
		ticket.setPassengerName(passenger.getPassengerName());
		ticket.setFromStation(passenger.getFromStation());
		ticket.setToStation(passenger.getToStation());
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setTrainNo(passenger.getTrainNo());
		
		ticket.setPnr(generatePNR());
		ticket.setDateOfBooking(getCurrentDate());
		ticket.setTicketStatus(getStatus());
		ticket.setTicketFare(1250.75f);
		
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}

	private String generatePNR() {
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString().replace("-", "").substring(0, 7).toUpperCase();		
		return str;
	}
	
	private String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String today = formatter.format(date);
		return today;
	}
	
	private String getStatus() {
		String status = new Random().nextBoolean()?"CONFIRMED":"WAITING";
		return  status;
	}
}
