package com.tcs.irctc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@Entity
public class Ticket {
	private String passengerName;
	private String fromStation;
	private String toStation;
	private String dateOfJourney;
	private Integer trainNo; 
	
	@Id
	private String pnr;
	private String dateOfBooking;
	private String ticketStatus;
	private Float ticketFare;
}
