package br.com.devdojo.javacore.introclasses.initializationblock.classes;

public class Costumer {
	
	private int [] parc;
	
	{
		parc = new int[100];
		System.out.println("Inside initialization block");
		for(int i = 1 ; i <= 100 ;i++) {
			parc[i -1] = i;
		}
	}
	
	public Costumer() {
	
	}
	
	
	//Getters and Setters 
	public int[] getParc() {
		return parc;
	}

	public void setParc(int[] parc) {
		this.parc = parc;
	}
	
	
	
	
	
}
