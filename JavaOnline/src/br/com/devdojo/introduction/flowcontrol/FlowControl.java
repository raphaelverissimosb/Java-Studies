package br.com.devdojo.introduction.flowcontrol;

public class FlowControl {

	public static void main(String[] args) {
		
		int age = 20;
		//float salary = 20000;
		
		// always evaluate a boolean value 
//		if(age > 18) {
//			System.out.println("You are in the club");
//		}else {
//			System.out.println("You were not accepted");
//		}
		
		String category;
		
		if(age < 15) {
			category ="Child category";
		}else if(age >=15 && age < 18) {
			category ="Teenager category";
		}else {
			  category = "Adult category";
		}
		
		System.out.println(category);
		
		
		
		
		
		
	}

}
