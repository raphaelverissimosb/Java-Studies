package br.com.devdojo.javacore.introclasses.polimorfism.classes;

public abstract class Employer {

	protected String name;
	protected double salary;
	
	
	public Employer() {
		
	}
	
	public Employer(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	//Methods
	
	public abstract void paymentCalc();
	
	@Override
	public String toString() {
		return "Employer [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
