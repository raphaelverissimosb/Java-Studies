package br.com.devdojo.javacore.introclasses.polimorfism.test;

import br.com.devdojo.javacore.introclasses.polimorfism.classes.FileDAOImplementation;
import br.com.devdojo.javacore.introclasses.polimorfism.classes.InterfaceDAO;

public class DAOtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceDAO fileDAOImplementation  = new FileDAOImplementation();
		fileDAOImplementation.save(); 
		
		
	}

}
