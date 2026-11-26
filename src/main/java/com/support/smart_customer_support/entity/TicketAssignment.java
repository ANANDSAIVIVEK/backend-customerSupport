package com.support.smart_customer_support.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "ticket_assignments")
@Data
public class TicketAssignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// The ticket being assigned
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ticket_id", nullable = false)
	private Ticket ticket;

	// The agent who is assigned to the ticket
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agent_id", nullable = false)
	private User agent;

	// The admin/user who assigned the ticket
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assigned_by", nullable = false)
	private User assignedBy;

	@CreationTimestamp
	@Column(name = "assigned_at", nullable = false, updatable = false)
	private LocalDateTime assignedAt;

	@Column(name = "active", nullable = false)
	private Boolean active = true;

	// Note: The generated column `active_ticket_id` is handled by MySQL.
	// We do NOT map it in the entity.
}