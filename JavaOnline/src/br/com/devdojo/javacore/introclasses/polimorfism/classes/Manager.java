package br.com.devdojo.javacore.introclasses.polimorfism.classes;

public class Manager extends Employer {
	
	private double profitSharing;
	
	
	//Constructors
	public Manager(String name, double salary) {
		super(name, salary);
	}
	
	public Manager(String name, double salary, double profitSharing) {
		super(name, salary);
		this.profitSharing = profitSharing;
	}

	
	//Getters and Setters 
	
	public double getProfitSharing() {
		return profitSharing;
	}

	public void setProfitSharing(double profitSharing) {
		this.profitSharing = profitSharing;
	}

	@Override
	public void paymentCalc() {
		this.salary = this.salary + profitSharing;
		
	}
	
	

	
}
