package com.infotech.book.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.book.ticket.entities.Ticket;
import com.infotech.book.ticket.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;
	
	
	@PostMapping(value="/create")
	public Ticket createTicket(@RequestBody Ticket ticket){
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value="/fetch/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}
	
	@GetMapping(value="/getAllTickets")
	public Iterable<Ticket> getAllBookings() {
		return ticketBookingService.getAllBookings();
	}
	
	@DeleteMapping(value="/delete/{ticketId}")
	public void deleteTicketById(@PathVariable("ticketId")Integer ticketId) {
		ticketBookingService.deleteTicketById(ticketId);
	}
	
	@PutMapping(value="/ticket/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("newEmail")String newEmail) {
		return ticketBookingService.updateTicket(ticketId,newEmail);
	}
}
