package br.com.devdojo.javacore.introclasses.finalmod.classes;

public class Car {
	
	private String name;
	private String brand;
	public static final double FINAL_SPEED = 240;
	private final Account account = new Account();
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//getter and setter to final method 
	public static double getFinalSpeed() {
		return FINAL_SPEED;
	}
	public Account getAccount() {
		return account;
	}

	
	
	
	//methods
	@Override
	public String toString() {
		return "Car [name=" + name + ", brand=" + brand + "]";
	}
	
	
	
	
	
}
