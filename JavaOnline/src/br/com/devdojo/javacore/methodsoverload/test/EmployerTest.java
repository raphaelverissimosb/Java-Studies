package br.com.devdojo.javacore.methodsoverload.test;

import br.com.devdojo.javacore.methodsoverload.classes.Employer;

public class EmployerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employer employer  = new Employer();
		
		employer.setName("Maria");
		employer.setCpf("1234587-12");
		employer.setSalary(2000);
		
		employer.print();

	}

}
