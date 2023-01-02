package com.tcs.irctc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.irctc.entities.Passenger;
import com.tcs.irctc.entities.Ticket;
import com.tcs.irctc.exceptions.TicketNotFoundException;
import com.tcs.irctc.repository.TicketRepository;

@RestController
@RequestMapping("/irctc")
public class TicketRestController {

	@Autowired
	private TicketRepository ticketRepo;	
	
	@PostMapping(value = "/ticket/new", 
			consumes = { "application/json", "application/xml" })
	public ResponseEntity<?> newTicketBooking(@RequestBody Passenger passenger) {
		System.out.println(passenger);
		// logic to generate the ticket for passenger and to save in db

		Ticket ticket = new Ticket();

		ticket.setPassengerName(passenger.getPassengerName());
		ticket.setFromStation(passenger.getFromStation());
		ticket.setToStation(passenger.getToStation());
		ticket.setTrainNo(passenger.getTrainNo());
		ticket.setDateOfJourney(passenger.getDateOfJourney());

		// ticket.setTicketFare(2570.50f);
		float fare = (int) (Math.random() * 10000);
		ticket.setTicketFare(fare);

		String status = new Random().nextBoolean() ? "confirmed" : "waiting";
		ticket.setTicketStatus(status.toUpperCase());

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dob = formatter.format(new Date());
		ticket.setDateOfBooking(dob);

		UUID uuid = UUID.randomUUID();
		String randomText = uuid.toString();
		randomText = randomText.replace("-", "");
		String pnr = randomText.substring(0, 7).toUpperCase();
		ticket.setPnr(pnr);

		if (!ticketRepo.existsById(pnr)) {
			ticketRepo.save(ticket);
			return new ResponseEntity<String>("Ticket Booking is Successful and Your PNR is : " + ticket.getPnr(),
					HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Internal Server Error!!! Try Again Later", HttpStatus.BAD_GATEWAY);
		}
	}

	@GetMapping(value = "/ticket/search/{pnr}", 
			produces = { "application/xml", "application/json" })
	public ResponseEntity<?> searchTicketByPnr(@PathVariable String pnr) {
		Optional<Ticket> optTicket = ticketRepo.findById(pnr);
		if (optTicket.isPresent()) {
			Ticket ticket = optTicket.get();
			return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
		}
		return new ResponseEntity<String>("No booking done on PNR: " + pnr, HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping(value = "/ticket/cancel/{pnr}")
	public ResponseEntity<?> cancelTicketByPnr(@PathVariable String pnr) {		
		if (ticketRepo.existsById(pnr)) {
			ticketRepo.deleteById(pnr);
			return new ResponseEntity<String>("Ticket with PNR: "+ pnr + " got cancelled and the amount will be refuded in 6 days", HttpStatus.OK);
		}
		throw new TicketNotFoundException("Ticket with PNR: "+ pnr +" is not available!");
	}
}
