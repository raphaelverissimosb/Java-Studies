package br.com.devdojo.javacore.introclasses.abstractclasses.classes;

public abstract class Employer extends Person {
	
	
	protected String clt;
	protected double salary;
	
	//Constructors
	public Employer() {
		
	}
	
	
	public Employer(String name, String clt, double salary) {
		super();
		this.name = name;
		this.clt = clt;
		this.salary = salary;
	}


	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClt() {
		return clt;
	}
	public void setClt(String clt) {
		this.clt = clt;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	//Methods
	public abstract void calcSalary();


	@Override
	public String toString() {
		return "Employer [name=" + name + ", clt=" + clt + ", salary=" + salary + "]";
	}
	
	
	
	
}
