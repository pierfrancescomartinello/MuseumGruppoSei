package it.GruppoSei.code.museumUsers;

import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import it.GruppoSei.queries.museumDatabase.AccountQueryHandler;
import it.GruppoSei.queries.museumSales.TicketQueryHandler;
import it.GruppoSei.queries.museumUsers.VisitorQueryHandler;

import java.math.BigDecimal;
import java.time.LocalDate;


import it.GruppoSei.code.museumNavigation.Visit;
import it.GruppoSei.code.museumSales.Ticket;
import it.GruppoSei.code.museumSales.Sales;


public class Visitor extends Person {	
	
	private int visitorId;

	//Da usare soltanto perche serve a JPA per il collegamento al DB
	protected Visitor() {}

	public Visitor(String name, String surname){
		super(name, surname);
	}

	public void signUp(String name, String surname, LocalDate dateOfBirth, LocalDate dateOfSignUp, boolean isAdult, int visitorId, String email, String password, String confirmPassword) throws ClassNotFoundException {
		if(email.matches("[[a-z]&&[_-.,]+&&[0-9++]+@[a-z]+.[a-z]+")) {
			if(password.equals(confirmPassword))
				VisitorQueryHandler.addVisitorQuery(name, surname, dateOfBirth, dateOfSignUp, isAdult, visitorId, email);
				AccountQueryHandler.addAccountQuery(email, password);
		}
	}

	public boolean buyTicket(String ticketType, LocalDate visitDate, BigDecimal ticketPrice, int visitorId) {
		TicketQueryHandler.addTicketQuery(ticketType, visitDate, true, ticketPrice, visitorId);
		return true;
	}

	
	public boolean deleteTicket(Ticket ticket) {
		return true;
	}

	public boolean showTickets() {
		TicketQueryHandler.showTicketsQuery(this.getVisitorId());
		return true;
	}

	public boolean buyGadget() {
		return true;
	}

	public boolean feedback(String feedback) {
		return true;
	}

	public boolean startVisit(int ticketId) {
		return true;
	}

	public int getVisitorId() {
		return this.visitorId;
	}

}
