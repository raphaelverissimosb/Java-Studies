package br.com.devdojo.javacore.introclasses.methodstest;

import br.com.devdojo.javacore.introclasses.methods.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// 
		
		Calculator calc = new Calculator();
		
		calc.sumTwoNumbers();
		calc.subTwoNumbers();
		
		// With parameters
		calc.multTwoNumbers(5, 5);
		// with return 
		System.out.println(calc.divTwoNumbers(20, 2));
		
		double divNumberEx = calc.divTwoNumbers(50, 5);
		System.out.println(divNumberEx);
	}

}
