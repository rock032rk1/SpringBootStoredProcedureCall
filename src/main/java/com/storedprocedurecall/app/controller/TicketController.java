package com.storedprocedurecall.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.storedprocedurecall.app.dao.TicketDao;
import com.storedprocedurecall.app.model.Ticket;

@RestController
public class TicketController {

	@Autowired
	private TicketDao ticketDao;
	
	@GetMapping("/findTicket")
	public List<Ticket> findTicket(){
		
		return ticketDao.getTicketInfo();
	}
	
	@GetMapping("/findTicketByCategary/{categary}")
	public List<Ticket> findTicketByCategary(@PathVariable String categary){
		
		return ticketDao.getTicketInfoByCategary(categary);
	}
	
}

