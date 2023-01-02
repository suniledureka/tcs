package com.tcs.irctc.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
	private String passengerName;
	private String fromStation;
	private String toStation;
	private String dateOfJourney;
	private Integer trainNo; 
	
	private String pnr;
	private String dateOfBooking;
	private String ticketStatus;
	private Float ticketFare;
}