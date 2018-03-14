package com.infotech.book.ticket.dao;

import org.springframework.data.repository.CrudRepository;

import com.infotech.book.ticket.entities.Ticket;

public interface TicketBookingDAO extends CrudRepository<Ticket, Integer>{

}
