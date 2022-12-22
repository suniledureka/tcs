package com.tcs.pms.beans.repository;

import org.springframework.stereotype.Repository;

//@Repository
@Repository("pmsRepo")
public class ProductRepository {

	public ProductRepository() {
		System.out.println("ProductRepository :: Constructor");
	}
	
	public void saveProduct() {
		System.out.println("...saving product...");
	}
}
