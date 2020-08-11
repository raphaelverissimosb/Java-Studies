package br.com.devdojo.javacore.methodsoverload.classes;

public class Employer {

	private String name;
	private String cpf;
	private double salary;
	private String rg;
	
	
	//Constructors
	public Employer() {
		
	}
	public Employer(String name, String cpf, String rg, double salary) {
		
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.salary = salary;
	}
	
	
	//getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	//methods
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.cpf);
		System.out.println(this.salary);
	}
	
	public void init(String name , String cpf , double salary) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
	}
	public void init(String name , String cpf , double salary, String rg) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
		this.rg = rg;
	}
	

	
}
