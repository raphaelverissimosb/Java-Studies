package br.com.devdojo.javacore.introclasses.inheritage.classes;

public class Address {
	private String street;
	private String neighbor;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNeighbor() {
		return neighbor;
	}
	public void setNeighbor(String neighbor) {
		this.neighbor = neighbor;
	}
	
	public void print() {
		System.out.println("Street :" + this.street);
		System.out.println("Neighbor :"+ this.neighbor);
		
	}
	
	
}
