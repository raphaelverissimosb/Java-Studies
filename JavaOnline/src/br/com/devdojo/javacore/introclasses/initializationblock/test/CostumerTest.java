package br.com.devdojo.javacore.introclasses.initializationblock.test;

import br.com.devdojo.javacore.introclasses.initializationblock.classes.Costumer;

public class CostumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Costumer costumer = new Costumer();
		
		System.out.println("Showing the parcels");
		
		for(int par : costumer.getParc()) {
			System.out.print(par+" \n");
		}
	}

}
