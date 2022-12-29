package com.tcs.boot.web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private Integer bookId;
	private String bookTitle;
	private Float bookPrice;
}
