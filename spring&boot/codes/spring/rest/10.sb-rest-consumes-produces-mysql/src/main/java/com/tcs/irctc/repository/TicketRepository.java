package com.tcs.irctc.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.tcs.irctc.entities.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Serializable> {

}
