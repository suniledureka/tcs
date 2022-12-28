package com.tcs.boot.cms;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tcs.boot.cms.entity.Contact;
import com.tcs.boot.cms.repository.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//----- get repository bean -------
		//ContactRepository contactRep = (ContactRepository) context.getBean("contactRepository");
		ContactRepository contactRepo = context.getBean(ContactRepository.class);
		System.out.println(contactRepo.getClass().getName());
		
		/*
		//to save or update a contact
		Contact contact = new Contact();
		contact.setContactId(101);
		contact.setContactName("Sunil Joseph");
		contact.setContactNumber("9848586878");
		
		contactRepo.save(contact);		
		System.out.println("$$$--- Contact Saved ---$$$");
		*/
		
		//to save multiple contacts		
		List<Contact> contacts = Arrays.asList(
							new Contact(102, "Charles Issac", "5588774458"),
							new Contact(103, "Chris", "9858478547"),
							new Contact(104, "Stephan", "8899556699"),
							new Contact(105, "Isaias", "7878784545")
						);				
		contactRepo.saveAll(contacts);
		
		context.close();
	}
}
