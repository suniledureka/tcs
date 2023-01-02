package com.tcs.boot.rest.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Book {
	private Integer bookId;
	private String bookTitle;
	private Float bookPrice;
}
