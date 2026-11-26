package com.support.smart_customer_support.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.support.smart_customer_support.entity.TicketComments;

@Repository
public interface TicketCommentsRepo extends JpaRepository<TicketComments, Long> {

}
