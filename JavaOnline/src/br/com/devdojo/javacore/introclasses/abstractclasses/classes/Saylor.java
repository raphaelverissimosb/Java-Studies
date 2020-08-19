package br.com.devdojo.javacore.introclasses.abstractclasses.classes;

public class Saylor extends Employer{

	
	private double totalSales;
	
	
	//Constructors
	public Saylor() {
		
	}
	
	public Saylor(double totalSales) {
		super();
		this.totalSales = totalSales;
	}

	public Saylor(String name, String clt, double salary, double totalSales) {
		super(name,clt,salary);
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
	public void calcSalary() {
		this.salary = salary + (totalSales * 0.05);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	
}
