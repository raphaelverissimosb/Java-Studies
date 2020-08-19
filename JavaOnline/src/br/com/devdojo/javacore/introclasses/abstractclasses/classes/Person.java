package br.com.devdojo.javacore.introclasses.abstractclasses.classes;

public abstract class Person {
	
	protected String name;

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
