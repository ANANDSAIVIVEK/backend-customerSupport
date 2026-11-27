package com.support.smart_customer_support.service;

import java.util.List;

import com.support.smart_customer_support.entity.Ticket;

public interface TicketService {
	Ticket createTicket(Ticket ticket);
	List<Ticket> getAllTickets();
	Ticket getTicketById(Long id);
	Ticket getCustomerTickets(Long customerId);
	Ticket updateTicket(Long id, Ticket ticket);
	void deleteTicket(Long id);
}
