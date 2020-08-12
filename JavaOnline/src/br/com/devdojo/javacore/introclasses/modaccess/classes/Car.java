package br.com.devdojo.javacore.introclasses.modaccess.classes;

public class Car {
	//max speed 2240 km/h
	private String name;
	private double maxVel;
	public static double limVel = 240;
	
	//Constructors
	public Car(double maxVel, double limVel) {
		this.maxVel = maxVel;
		limVel = limVel;
	}
	
	public Car(double limVel, String name) {
		limVel = limVel;
		this.name = name;
	}
	public Car() {
		
	}
	
	
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMaxVel() {
		return maxVel;
	}
	public void setMaxVel(double maxVel) {
		this.maxVel = maxVel;
	}
//	public double getLimVel() {
//		return limVel;
//	}
//	public void setLimVel(double limVel) {
//		this.limVel = limVel;
//	}

	
	//methods
	public void print() {
		System.out.println("Name "+this.name);
		System.out.println("Max speed "+this.maxVel);
		System.out.println("Limit speed "+limVel);
		System.out.println();
	}
	
	
}
