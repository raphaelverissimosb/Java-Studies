package br.com.devdojo.javacore.introclasses.exceptions.checkedexceptions.test;

import br.com.devdojo.javacore.introclasses.exceptions.checkedexceptions.classes.Employer;
import br.com.devdojo.javacore.introclasses.exceptions.checkedexceptions.classes.Person;

public class OverrideExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employer employer = new Employer();
		Person person = new Person();
		
		employer.save();
	}

}
