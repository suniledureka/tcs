package com.tcs.irctc.entities;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Passenger {
	private String passengerName;
	private String fromStation;
	private String toStation;
	private String dateOfJourney;
	private Integer trainNo; 
}
