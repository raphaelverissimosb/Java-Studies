package br.com.devdojo.javacore.introclasses.test;

import br.com.devdojo.javacore.introclasses.Teacher;

public class TeacherTest {

	public static void main(String[] args) {
		// 
		
		Teacher teacher = new Teacher();
		
		teacher.name = "Raphael";
		teacher.register = "123456";
		teacher.rg = "47456856-01";
		teacher.cpf = "12345678910";
		
		System.out.println(teacher.name);
		System.out.println(teacher.register);
		System.out.println(teacher.rg);
		System.out.println(teacher.cpf);
		
		

	}

}
