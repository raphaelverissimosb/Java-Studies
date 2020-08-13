package br.com.devdojo.javacore.introclasses.inheritage.classes;

public class Employer extends Person {
	
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	//methods
	public void print() {
		super.print();
		System.out.println("Salary :"+this.salary);
		printReceiptPayment();
	}
	
	public void printReceiptPayment() {
		System.out.println("Me"+super.name+"received payment as value of:"+this.salary);
	}
	
}
