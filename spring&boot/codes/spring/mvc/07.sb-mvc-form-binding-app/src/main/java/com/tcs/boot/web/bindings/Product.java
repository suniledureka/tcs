package com.tcs.boot.web.bindings;

import lombok.Data;

@Data
public class Product {
	private Integer productId;
	private String productName;
	private Float productPrice;
}
