package com.gl.assignment16.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.assignment16.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
