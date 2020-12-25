package com.storedprocedurecall.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "firstProcedure", procedureName = "getTicket"),
		@NamedStoredProcedureQuery(name = "secondProcedure", procedureName = "getTicketByCategary", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "tcategary", type = String.class) }) })
public class Ticket {

	@Id
	private int id;
	private int amount;
	private String categary;
	
//	public Ticket() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Ticket(int amount, String categary) {
//		super();
//		this.amount = amount;
//		this.categary = categary;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getAmount() {
//		return amount;
//	}
//
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}
//
//	public String getCategary() {
//		return categary;
//	}
//
//	public void setCategary(String categary) {
//		this.categary = categary;
//	}
//	
	
}
