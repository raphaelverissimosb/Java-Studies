package br.com.devdojo.javacore.introclasses.methodstest;

import br.com.devdojo.javacore.introclasses.methods.Teacher;

public class TeacherTest {
  
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		
		teacher.cpf = "1111111111";
		teacher.name = "Roberto";
		teacher.register = "12345656";
		teacher.rg = "15242366-8";
		
		teacher.printData();
		
		
		teacher.printData();
		System.out.println(teacher.name);
		
	}
	
	
 
	
}
