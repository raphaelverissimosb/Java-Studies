package br.com.devdojo.javacore.introclasses.inheritage.classes;

public class Person {
	protected String name;
	protected String cpf;
	protected Address adress;
	
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
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	
	
	//method 
	
	public void print() {
		System.out.println("Name :"+ this.name);
		System.out.println("Cpf :"+this.cpf);
		System.out.println("Address :"+ adress.getNeighbor());
		System.out.println("Address :"+ adress.getStreet());
	} 
}
