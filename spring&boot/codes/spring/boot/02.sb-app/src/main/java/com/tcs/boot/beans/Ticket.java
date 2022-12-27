package com.tcs.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ticket {
	@Value("DWR34QU")
	private String pnr;
	
	@Value("Sunil Joseph")
	//@Value("${ticket.passenger.name}")
	private String passengerName;
	
	@Override
	public String toString() {
		return "Ticket [PNR= " + pnr + " | NAME= " + passengerName + "]";
	}
}
