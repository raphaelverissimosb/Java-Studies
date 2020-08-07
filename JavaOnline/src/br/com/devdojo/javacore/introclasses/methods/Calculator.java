package br.com.devdojo.javacore.introclasses.methods;

public class Calculator {
	// methods without parameters 
	public void sumTwoNumbers() {
		System.out.println(5+5);
	}
	public void subTwoNumbers() {
		System.out.println(5-5);
	}
	
	public void multTwoNumbers(int number1 , int number2) {
		 System.out.println(number1  * number2);
	}
	
	public double divTwoNumbers(double num1 , double num2) {
		return num1 / num2;
	}
	
}
