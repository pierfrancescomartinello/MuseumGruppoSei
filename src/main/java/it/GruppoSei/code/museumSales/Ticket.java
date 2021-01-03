package it.GruppoSei.code.museumSales;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import it.GruppoSei.code.museumUsers.Visitor;
import it.GruppoSei.code.museumUtil.Utilities;


@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String ticketID;
	private String ticketType;
	private BigDecimal ticketPrice;
	private LocalDate visitDate;
	private Visitor owner;
	private LocalDate purchaseDate;
	private boolean isUsable;
	
	protected Ticket () {}

	public Ticket (String ticketType, LocalDate visitDate, BigDecimal ticketPrice, String id) {
		this.ticketType = ticketType;
		this.visitDate = visitDate;
		this.ticketPrice = ticketPrice;	
	}
	

	//Getters and Setters Methods
	public String getTicketID() {
		return this.ticketID;
	}
	
	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}
	
	public String getTicketType() {
		return this.ticketType;
	}
	

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	
	public BigDecimal getTicketPrice() {
		return this.ticketPrice;
	}
	
	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public LocalDate getVisitDate() {
		return this.visitDate;
	}
	
	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}
	public Visitor getOwner() {
		return this.owner;
	}
	
	public void setOwner(Visitor owner) {
		this.owner = owner;
	}
	
	public LocalDate getPurchaseDate() {
		return this.purchaseDate;
	}
	
	public void setPurchaseDate(int dd, Month mmm, int yyyy) {
		this.purchaseDate = Utilities.LocalDateCreator(dd, mmm, yyyy);
	}
	
	public boolean isUsable() {
		return this.isUsable;
	}
	
	public void setUsable(boolean isUsable) {
		this.isUsable = isUsable;
	}
	
}
