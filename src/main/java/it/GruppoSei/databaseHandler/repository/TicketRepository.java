package it.GruppoSei.databaseHandler.repository;

import org.springframework.data.repository.CrudRepository;

import it.GruppoSei.code.museumSales.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
