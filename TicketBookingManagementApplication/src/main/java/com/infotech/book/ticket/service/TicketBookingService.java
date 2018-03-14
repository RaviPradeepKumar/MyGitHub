package com.infotech.book.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.book.ticket.dao.TicketBookingDAO;
import com.infotech.book.ticket.entities.Ticket;

@Service
public class TicketBookingService {
	
	@Autowired
	private TicketBookingDAO ticketBookingDAO;

	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDAO.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDAO.findOne(ticketId);
	}

	public Iterable<Ticket> getAllBookings() {
		return ticketBookingDAO.findAll();
	}

	public void deleteTicketById(Integer ticketId) {
		ticketBookingDAO.delete(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
		 Ticket ticketFromDB = ticketBookingDAO.findOne(ticketId);
		 ticketFromDB.setEmail(newEmail);
		 Ticket updatedTicket = ticketBookingDAO.save(ticketFromDB);
		 return updatedTicket;
	}
}
