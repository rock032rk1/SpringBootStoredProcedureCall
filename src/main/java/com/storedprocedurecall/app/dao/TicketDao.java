package com.storedprocedurecall.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.storedprocedurecall.app.model.Ticket;

@Repository
public class TicketDao {

	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketInfo(){
		
		return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketInfoByCategary(String input){
		
		return em.createNamedStoredProcedureQuery("secondProcedure").setParameter("tcategary", input).getResultList();
	}
	
	
}
