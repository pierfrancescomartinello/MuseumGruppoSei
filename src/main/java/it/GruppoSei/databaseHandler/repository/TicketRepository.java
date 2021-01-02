package it.GruppoSei.databaseHandler.repository;

import org.springframework.data.repository.CrudRepository;

import museumSales.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
