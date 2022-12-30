package com.tcs.boot.web.bindings;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Product {
	@NotNull(message = "*required")
	private Integer productId;
	
	//@NotEmpty(message="*required")
	@NotBlank(message="*required")
	@Size(min = 5, message="*min 5 chars")
	private String productName;
	
	@NotNull(message = "*required")
	private Float productPrice;
}
