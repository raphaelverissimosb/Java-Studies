package br.com.devdojo.javacore.introclasses.methodstest;

import br.com.devdojo.javacore.introclasses.methods.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// 
		
		Calculator calc = new Calculator();
		
		calc.sumTwoNumbers();
		calc.subTwoNumbers();
		System.out.println();
		
		
		// With parameters
		calc.multTwoNumbers(5, 5);
		System.out.println();
		
		// with return 
		System.out.println(calc.divTwoNumbers(20, 2));
		System.out.println();
		
		double divNumberEx = calc.divTwoNumbers(50, 5);
		System.out.println(divNumberEx);
		System.out.println();
		
		calc.printTwoNumbersDiv(20, 5);
		
		System.out.println();
		int[] numbers = new int []{1,2,3,4,6};
		calc.sumArray(numbers);
		
		System.out.println();
		calc.sumVarArgs(1,2,3,4,6,1);
	}

}
