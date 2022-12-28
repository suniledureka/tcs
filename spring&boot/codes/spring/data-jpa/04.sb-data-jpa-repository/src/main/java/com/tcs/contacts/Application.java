package com.tcs.contacts;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.tcs.contacts.entity.Contact;
import com.tcs.contacts.repository.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ContactRepository contactRepo = context.getBean(ContactRepository.class);
		System.out.println();
		
		/*
		//----- get the contacts in the ascending order of ContactName ---------------------------
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName"));
		List<Contact> contacts = contactRepo.findAll(Sort.by("contactName").ascending());
		displayContacts(contacts);
		*/		
		
		/*
		//----- get the contacts in the descending order of ContactName ---------------------------
		List<Contact> contacts = contactRepo.findAll(Sort.by("contactName").descending());
		//displayContacts(contacts);		
		contacts.forEach(contact -> System.out.println(contact));
		*/
		
		
		//---- retrieve contacts using Pagination
		int pageNo = 0; //pageNo starts from 0 (means first page)
		int pageSize = 4;
		
		Page<Contact> page = contactRepo.findAll(PageRequest.of(pageNo, pageSize));
		List<Contact> contacts = page.getContent();
		System.out.println("--------------------- page 1/10 ----------------------");
		displayContacts(contacts);
		System.out.println();
		
		pageNo = 1;
		page = contactRepo.findAll(PageRequest.of(pageNo, pageSize));
		contacts = page.getContent();
		System.out.println("--------------------- page 2/10 ----------------------");
		displayContacts(contacts);
		System.out.println();
		
		context.close();
	}
	
	private static void displayContacts(Iterable<Contact> contacts) {
		for(Contact contact : contacts) {
			System.out.println(contact);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}		
	}	
}
