package br.com.devdojo.javacore.introclasses.abstractclasses.classes;

public abstract class Person {
	// this is an abstract class
	protected String name; // every abstract element must be protected

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Methods
	public abstract void print();
	
	
}
