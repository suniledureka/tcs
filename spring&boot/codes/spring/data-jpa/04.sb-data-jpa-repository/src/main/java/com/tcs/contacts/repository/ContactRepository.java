package com.tcs.contacts.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.contacts.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable> {

}
