package com.support.smart_customer_support.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.support.smart_customer_support.entity.TicketAssignment;

@Repository
public interface TicketAssignmentRepo extends JpaRepository<TicketAssignment, Long>{

}
