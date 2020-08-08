package br.com.devdojo.javacore.introclasses.methodstest;

import br.com.devdojo.javacore.introclasses.methods.Calculator;

public class ParametersTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int num1 = 5;
		int num2 = 10;
		
		calc.changeTwoNumbers(num1, num2);
		
		System.out.println("Inside the method");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
	}
	
}
