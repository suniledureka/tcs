package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tcs.hibernate.entity.Product;

public class SaveProduct {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml"); //XML Parsing
		
		SessionFactory sfactory = config.buildSessionFactory(); 
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Product prod = new Product();
		prod.setProductId(101);
		prod.setProductName("Computer");
		prod.setProductPrice(35750.75f);
		
		session.save(prod);
		tx.commit();
		
		session.close();
		sfactory.close();

	}

}
