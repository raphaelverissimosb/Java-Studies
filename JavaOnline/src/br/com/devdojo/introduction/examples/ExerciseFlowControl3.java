package br.com.devdojo.introduction.examples;

public class ExerciseFlowControl3 {
	public static void main (String[] args) {
		byte day = 4;
		
		switch(day) {
		case 1:
			System.out.println("Sunday is a weekend");
			break;
		case 2:
			System.out.println("Monday is a week day");
			break;
		case 3:
			System.out.println("Tuesday is a week day");
			break;
		case 4:
			System.out.println("Wednesday is a week day");
			break;	
		case 5:
			System.out.println("Thursday is a week day");
			break;
		case 6:
			System.out.println("Friday is a week day");
			break;
		case 7:
			System.out.println("Saturday is a weekend day");
			break;
		default:
			System.out.println("This is a vaalid week or weekend day! Try again!");
		}
	}
}
