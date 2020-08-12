package br.com.devdojo.javacore.introclasses.overloadconstructors.test;

import br.com.devdojo.javacore.introclasses.overloadconstructors.classes.Student;

public class StudentTest {

	public static void main(String[] args) {
		//
		
		Student student = new Student("123456","Raphael", new double [] {10,8,7,4,6});
		
		student.priint();
	}

}
