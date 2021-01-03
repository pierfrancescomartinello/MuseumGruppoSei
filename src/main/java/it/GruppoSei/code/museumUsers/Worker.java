package it.GruppoSei.code.museumUsers;

import java.math.*;

public abstract class Worker extends Person{
	
	protected Worker() {}
	
	public Worker(String name, String surname){
		super(name, surname);
	}

	public abstract int getEmployeeId();
	public abstract int getWorkingHours();
	public abstract BigDecimal getSalary();

}
