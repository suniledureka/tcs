package com.tcs.pms;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tcs.pms.entity.Product;
import com.tcs.pms.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository repo = context.getBean(ProductRepository.class);
		
		Product prod1 = new Product("Mouse", 375.50f);
		Product prod2 = new Product("Keyboard", 575.50f);
		Product prod3 = new Product("Monitor", 7500f);
		Product prod4 = new Product("Television", 62750f);
		
		/*
		Product savedProduct = repo.save(prod1);
		System.out.println(savedProduct);
		*/
		
		List<Product> savedProds = repo.saveAll(Arrays.asList(prod1, prod2, prod3,prod4));
		savedProds.stream().forEach(product -> {
			System.out.println(product);
			try {
				Thread.sleep(1000);
			}
			catch(Exception ex) {}
		 });
	}

}
