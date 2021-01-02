package it.GruppoSei.databaseHandler.repository;

import org.springframework.data.repository.CrudRepository;

import museumUsers.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
