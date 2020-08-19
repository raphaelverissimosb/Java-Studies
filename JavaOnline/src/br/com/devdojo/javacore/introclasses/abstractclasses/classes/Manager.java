package br.com.devdojo.javacore.introclasses.abstractclasses.classes;

public class Manager extends Employer{
	
	//Constructor	
	public Manager() {
		
	}
	public Manager(String name, String clt, double salary) {
		super(name, clt, salary);
	}
	
	
	
	//Methods
	
	@Override
	public void calcSalary() {
		this.salary = salary + (salary * 0.2);
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
