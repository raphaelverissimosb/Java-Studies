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
		
		if(num2 != 0) {
			return num1 / num2;
	
		}
		return 0;
	}
	
	public void printTwoNumbersDiv(double num1 , double num2) {
		
		if(num2 != 0) {
			System.out.println(num1 / num2);
			return;
		}
		
	}
	
	public void changeTwoNumbers(int num1 , int num2) {
		num1 = 30;
		num2 = 40;
		System.out.println("Inside the method");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
	}
	
	public void sumArray(int[] numbers) {
		
		int sum = 0;
		
		for (int num : numbers) {
			sum+= num;
		}
		
		System.out.println(sum);
	}
	
	
	public void sumVarArgs(int...numbers) {
		int sum = 0;
		
		for (int num : numbers) {
			sum+= num;
		}
		
		System.out.println(sum);
	}
}
