package br.com.devdojo.introduction.examples;

public class Student {
	private String name;
	private int age;
	private double grade[];
	private boolean approved;
	//Getters and Setters
	
	public void setName(String name) {
		if(age <=0) {
			System.out.println("Invalid age");
			return;
		}else {
		this.name = name;
		}
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
	
	public void setGrade(double[] grade) {
		this.grade = grade;
	}
	public double[] getGrade() {
		return grade;
	}
	
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public boolean getApproved() {
		return this.approved;
	}
	
	
	
	//methods 
	public void printData(Student student) {
		System.out.println(this.name);
		System.out.println(this.age);
		
		
		System.out.println();
		System.out.println("***Print the grades***");
		for(double nota : grade) {
			System.out.println("Nota :" + nota);
		}
		
		System.out.println();
		System.out.println("***Print the student result***");
		double sum = 0;
		for(int i = 0 ; i < grade.length; i++) {
			sum += grade[i];
		}
		
		double result = sum / grade.length; 
		
		if(result > 6) {
			this.approved = true;
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
			this.approved = false;
		}
		
		
	}
}



