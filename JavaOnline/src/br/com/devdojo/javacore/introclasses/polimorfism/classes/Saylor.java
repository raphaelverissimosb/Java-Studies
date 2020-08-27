package br.com.devdojo.javacore.introclasses.polimorfism.classes;

public class Saylor extends Employer {
	
	private double totalSales;
	
	public Saylor() {
		
	//Constructors	
	}
	public Saylor(String name, double salary) {
		super(name, salary);
	}
	public Saylor(String name, double salary, double totalSales ) {
		super(name, salary);
		this.totalSales = totalSales;
	}

	
	//Getters and Setters
	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
	
	
	@Override
	public void paymentCalc() {
		
		this.salary = this.salary + (totalSales * 0.05);
	}
	
	
	
	
}
