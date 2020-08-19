package br.com.devdojo.javacore.introclasses.abstractclasses.test;

import br.com.devdojo.javacore.introclasses.abstractclasses.classes.Employer;
import br.com.devdojo.javacore.introclasses.abstractclasses.classes.Manager;
import br.com.devdojo.javacore.introclasses.abstractclasses.classes.Saylor;

public class EmployerTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Saylor saylor = new Saylor("Raphael", "2135-45",1500, 45000);
		Manager manager = new Manager("Anna","2012-8", 2000);
		
		manager.calcSalary();
		saylor.calcSalary();
		
		System.out.println(manager);
		System.out.println(saylor);
	}

}
