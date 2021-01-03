package it.GruppoSei.code.museumUsers;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Salesperson extends EmployeeDecorator{
	
	public Salesperson() {}
	
	public Salesperson(Worker specializedEmployee) {
		super(specializedEmployee);
	}
}
