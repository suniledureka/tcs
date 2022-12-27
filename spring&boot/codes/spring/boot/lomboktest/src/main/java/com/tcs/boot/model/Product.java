package com.tcs.boot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
@Getter
@Setter
@ToString
@EqualsAndHashCode
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class Product {
	private Integer productId;
	private String productName;
	private Float productPrice;
}
