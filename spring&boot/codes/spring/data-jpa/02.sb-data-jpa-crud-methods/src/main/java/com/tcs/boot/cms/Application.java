package com.tcs.boot.cms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tcs.boot.cms.entity.Contact;
import com.tcs.boot.cms.repository.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Scanner sc = new Scanner(System.in);
		
		ContactRepository contactRepo = context.getBean(ContactRepository.class);
		
		/*
		//---------------- find the number of contacts -----------------------
		long noOfContacts = contactRepo.count();
		System.out.println("no of contacts = " + noOfContacts);
		System.out.println();
		*/
		
		/*
		//--------------- find a contact based on cotactId -----------------
		System.out.print("enter contact id to search: ");
		int cid = sc.nextInt();
		Optional<Contact> optContact = contactRepo.findById(cid);
		if(optContact.isPresent()) {
			Contact contact = optContact.get();
			System.out.println(contact);
		}else {
			System.out.println("$$$--- no matching contact with contactId: " + cid + " ---$$$");
		}
		*/
		
		/*
		//-------------- find some specific contacts based on IDs -----------
		List<Integer> contactIds = Arrays.asList(101,103,108,120,104);
		Iterable<Contact> contacts = contactRepo.findAllById(contactIds);
		printContacts(contacts);
		*/
		
		/*
		//--------------- find all contacts ---------------------------------
		Iterable<Contact> contacts = contactRepo.findAll();
		printContacts(contacts);
		*/
		
		//-------------- to check whether a Contact is existing with an ID ---
		int contactId = 1015;
		boolean isExists = contactRepo.existsById(contactId);
		System.out.println("is Contact with ID: "+contactId+" exists in data store = " + isExists);
		
		sc.close();
		context.close();
	}

	private static void printContacts(Iterable<Contact> contacts) {
		for(Contact ct : contacts) {
			System.out.println(ct);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}		
	}

}
