package com.tcs.boot.cms.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.boot.cms.entity.Contact;

@Repository //optional
public interface ContactRepository extends CrudRepository<Contact, Serializable> {

	Optional<Contact> findByContactName(String cname);

	Contact findByContactNumber(String cnumber);

	Optional<Contact> findByContactNameAndContactNumber(String cname, String cnumber);

	List<Contact> findByContactNameOrContactNumber(String cname, String cnumber);
	
	//@Query("select contactName from com.tcs.boot.cms.entity.Contact")
	@Query(value = "select contactName from com.tcs.boot.cms.entity.Contact")
	List<String> findAllContactNames();

	@Query(value = "select contact_name from contact_master", nativeQuery = true)
	List<String> findAllContactNamesWithSQL();

	@Query(value = "select contact from com.tcs.boot.cms.entity.Contact contact where contactName = :cname")
	Contact findContactWithName(String cname);

}
