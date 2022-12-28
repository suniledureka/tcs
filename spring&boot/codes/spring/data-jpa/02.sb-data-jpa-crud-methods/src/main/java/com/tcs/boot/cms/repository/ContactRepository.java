package com.tcs.boot.cms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.boot.cms.entity.Contact;

@Repository //optional
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
