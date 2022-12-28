package com.tcs.boot.cms.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CONTACT_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
	@Id
	@Column(name = "CONTACT_ID")
	private Integer contactId;
	
	@Column(name = "CONTACT_NAME")
	private String contactName;
	
	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;

	@Override
	public String toString() {
		return String.format("Contact [%-3d | %-15s | %-10s]",contactId, contactName, contactNumber);
	}
	
	
}
