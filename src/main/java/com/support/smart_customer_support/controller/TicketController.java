package com.support.smart_customer_support.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tickets")
public class TicketController {

	//1. Submit a new complaint/ticket
	@PostMapping
	public String createTickets() {
		return "complaint created";
	}

	// 2. View all tickets
	@GetMapping
	public String getAllTickets() {
		return "Displating All Tickets";
	}

	// 3. View ticket by ID
	@GetMapping("/{id}")
	public String getTicketById(@PathVariable Long id) {
		return "Ticket:" + id;
	}

	// 4. View customer tickets
	@GetMapping("/customer/{customerId}")
	public String getCustomerTickets(@PathVariable Long customerId) {
		return "Tickets for Customer ID: " + customerId;
	}

	// 5. Update ticket
	@PutMapping("/{id}")
	public String updateTicket(@PathVariable Long id) {
		return "Ticket updated: " + id;
	}

	// 6. Delete ticket
	@DeleteMapping("/{id}")
	public String deleteTicket(@PathVariable Long id) {
		return "Ticket Deleted: " + id;
	}
}
