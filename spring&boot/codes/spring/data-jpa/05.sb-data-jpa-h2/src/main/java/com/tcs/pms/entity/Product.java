package com.tcs.pms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
//@Table(name = "PRODUCT")
public class Product {
	@Id
	//@Column(name = "PRODUCT_ID")
	//@GeneratedValue(generator = GenerationType.AUTO)	
	@GeneratedValue(generator = "pidGen")
	@GenericGenerator(name = "pidGen", strategy = "com.tcs.pms.repository.generators.ProductIdGenerator")	
	private String productId;
	
	private String productName;
	private Float productPrice;
	
	public Product(String productName, Float productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
}
