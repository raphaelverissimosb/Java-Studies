package br.com.devdojo.javacore.introclasses.sertions.test;

public class AssertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcSalary(-2000);
	}

	
	
	private static void calcSalary(double salary) {
		
		assert(salary > 0): "Invalid value < 0" + salary;
		
	}
	
	public static void calcSalaryTwo(double salary) throws IllegalAccessException {
		if(salary < 0) {
			throw new IllegalAccessException();
		}
	}
}
