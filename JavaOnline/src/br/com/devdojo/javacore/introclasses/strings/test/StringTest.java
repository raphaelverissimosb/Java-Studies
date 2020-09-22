package br.com.devdojo.javacore.introclasses.strings.test;

public class StringTest {

	public static void main(String[] args) {
	
		String name = "Raphael";
		name.concat("Verissimo");
		
		
		//String secondName =  new String ("Verissimo");
		//System.out.println(name + secondName);

		String  test = "Goku";
		String test2 ="GOKU";
		String test3 = "  123456   ";
		
		System.out.println(test.charAt(3));
		System.out.println(test.equals(test));
		System.out.println(test.equalsIgnoreCase(test));
		System.out.println(test.length());
		System.out.println(test.replace('o','a'));
		System.out.println(test3.substring(0,4));
		System.out.println(test3.trim()); // to remove extra spaces
		
		
		
		
	}
}
