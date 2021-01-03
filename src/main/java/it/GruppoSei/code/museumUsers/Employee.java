package it.GruppoSei.code.museumUsers;

import java.math.BigDecimal;

import it.GruppoSei.code.museumUtil.Utilities;

public class Employee extends Worker{
	
	private int employeeId;
	private int workingHours;
	private BigDecimal salary;
	  
	public Employee(String name, String surname, int workingHours, BigDecimal salary, int id){
		super(name, surname);
		this.workingHours = workingHours;
		this.salary = salary;
		this.employeeId = id;
	}
	
	public Employee(String name, String surname, int workingHours, BigDecimal salary){
		super(name, surname);
		this.workingHours = workingHours;
		this.salary = salary;
		this.employeeId = Utilities.generateId();//9?
	}
	
	public int getEmployeeId(){
		return this.employeeId;
	}
	  
	public int getWorkingHours(){
		return this.workingHours;
	}
	
	public BigDecimal getSalary(){
		return this.salary;
	}
	
	public void setWorkingHours(int newHours){
		this.workingHours = newHours;
	}
	
	public void setSalary(BigDecimal newSalary){
		this.salary = newSalary;
	}
	
	public String getEmployeeEmail() {
		return null;
	}
}
