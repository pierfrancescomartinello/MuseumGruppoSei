package museumUsers;

import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import it.GruppoSei.databaseHandler.queries.museumDatabase.AccountQueryHandler;
import it.GruppoSei.databaseHandler.queries.museumUsers.VisitorQueryHandler;

import java.math.BigDecimal;
import java.time.LocalDate;


import museumNavigation.Visit;
import museumSales.Ticket;
import museumSales.Sales;


public class Visitor extends Person {	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String visitorId;
	private Sales sales;
	

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

	public boolean buyTicket(String type, LocalDate date, BigDecimal price) {
		Ticket ticket = new Ticket(type, date, price, this.visitorId);
		sales.addTicket(ticket);
		
		return true;
	}

	
	public boolean deleteTicket(Ticket ticket) {
		this.sales.getSoldTickets().remove(ticket);
		return true;
	}

	public ArrayList<Ticket> showTickets() {
		return this.sales.getSoldTickets();
	}

	public boolean buyGadget() {
		return true;
	}

	public boolean feedback(String feedback) {
		return true;
	}

	public Visit startVisit(Ticket ticket) {
		Visit v = null;
		return v;
	}

	public String getVisitorID() {
		return this.visitorId;
	}

}
