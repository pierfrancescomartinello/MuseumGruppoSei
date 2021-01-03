package it.GruppoSei.databaseHandler.repository;

import org.springframework.data.repository.CrudRepository;
import it.GruppoSei.code.museumUsers.Visitor;

public interface VisitorRepository extends CrudRepository<Visitor, Integer>{
	
}
