package it.GruppoSei.databaseHandler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.GruppoSei.code.museumUsers.Worker;


public interface WorkerRepository extends JpaRepository<Worker, Integer>{
	//Queries for Worker table
}
