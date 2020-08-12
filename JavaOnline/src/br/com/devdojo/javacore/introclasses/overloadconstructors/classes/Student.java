package br.com.devdojo.javacore.introclasses.overloadconstructors.classes;

public class Student {
	
	private String register;
	private String name;
	private double[] grade;
	
	
	public Student() {
		
	}
	public Student (String register, String name, double[] grade) {
		this.register = register;
		this.name = name;
		this.grade = grade;
	}
		
	//Getters and Setters
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double[] getGrade() {
		return grade;
	}
	public void setGrade(double[] grade) {
		this.grade = grade;
	}
	
	//Methods
	public void priint() {
		System.out.println("Name:" +this.name);
		System.out.println();
		System.out.println("Register number :" +this.register);
		System.out.println();
		for(double grades : grade) {
			System.out.println("Nota: " +grades);
		}
	}
	
}
