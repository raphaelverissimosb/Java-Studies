package br.com.devdojo.introduction.examples;

public class ExampleFlowControl {
	public static void main (String[] args) {
		
		float salary = 1800f;
		int fee ;
		if(salary < 1000) {
			fee = 5;
		}else if ((salary >= 1000) && (salary < 2000)) {
			fee = 10;
		}else if ((salary >= 2000)&&(salary < 4000)) {
			fee = 15;
		}else {
			fee = 20;
		}
		
		System.out.println("The salary fee is " + fee +  "%");
	 	
		
	}
}
