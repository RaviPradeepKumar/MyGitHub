package com.infotech.book.ticket;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.book.ticket.entities.Ticket;
import com.infotech.book.ticket.service.TicketBookingService;


@SpringBootApplication
public class TicketBookingManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagementApplication.class, args);
		
		
		Ticket ticket = new Ticket();
		ticket.setPassengerName("Raja");
		ticket.setSourceStation("HYDERBAD");
		ticket.setDestinationStation("RAJAHMUNDRY");
		ticket.setDateOfBooking(new Date());
		ticket.setEmail("raja@gmail.com");
		
		TicketBookingService bookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);
		bookingService.createTicket(ticket);
	}
}
