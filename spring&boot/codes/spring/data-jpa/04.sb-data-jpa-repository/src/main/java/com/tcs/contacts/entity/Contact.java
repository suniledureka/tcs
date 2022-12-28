package com.tcs.contacts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CONTACT_MASTER")
@Data
public class Contact {
	@Id
	private Integer contactId;
	private String contactName;
	private String contactNumber;
	
	@Override
	public String toString() {
		return String.format("Contact [%-3d | %-15s | %-10s]", contactId , contactName, contactNumber);
	}		
}
