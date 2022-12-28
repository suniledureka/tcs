package com.tcs.boot.cms;

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
		
		ContactRepository contactRepo = context.getBean(ContactRepository.class);
		/*
		String cname = "Chris";
		Optional<Contact> optContact = contactRepo.findByContactName(cname);
		if(optContact.isPresent()) {
			Contact contact = optContact.get();
			System.out.println(contact);
		}else{
			System.out.println("no matching contact found");
		}		
		*/
		
		/*
		String cnumber = "9848586878";
		Contact contact = contactRepo.findByContactNumber(cnumber);
		System.out.println(contact);
		*/
		
		/*
		String cname = "Chris";
		String cnumber = "9848586878";
		
		//Optional<Contact> opt = contactRepo.findByContactNameAndContactNumber(cname, cnumber);
		List<Contact> contacts = contactRepo.findByContactNameOrContactNumber(cname, cnumber);
		for(Contact ct : contacts) {
			System.out.println(ct);
		}
		*/
		
		List<String> contactsNames = contactRepo.findAllContactNames();
		System.out.println("contact person names ====> ");
		for(String cname : contactsNames) {
			System.out.println("\t\t---> " + cname);
		}
		
		System.out.println();
		
		List<String> contactsNames1 = contactRepo.findAllContactNamesWithSQL();
		System.out.println("contact person names ====> ");
		for(String cname : contactsNames1) {
			System.out.println("\t\t---> " + cname);
		}
		
		System.out.println("------------------------------------------------------------------");
		Contact contact = contactRepo.findContactWithName("Chris");
		System.out.println(contact);
		
		context.close();
	}

}
