package br.com.devdojo.javacore.introclasses.inheritage.test;

import br.com.devdojo.javacore.introclasses.inheritage.classes.Address;
import br.com.devdojo.javacore.introclasses.inheritage.classes.Employer;
import br.com.devdojo.javacore.introclasses.inheritage.classes.Person;

public class InheritageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.setName("Raphael");
		person.setCpf("123456563-12");
		Address address = new Address();
		address.setNeighbor("Av 1");
		address.setStreet("Francisco Ribeiro");
		person.setAdress(address);
		
		person.print();
		
		System.out.println("***********************************");
		
		Employer employer = new Employer();
		employer.setSalary(3000);
		employer.setName("Marcos");
		employer.setCpf("12545252-15");
		employer.setAdress(address);
		
		employer.print();
	}

}
