package br.com.devdojo.javacore.introclasses.strings.test;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Just a phrase";
		StringBuilder sb  =  new StringBuilder(16);
		
		sb.append("Just a phrase");
		sb.append(" test");
		System.out.println(sb.reverse());
		//System.out.println(sb.delete());
		//on this argument is just to delete elements inside your string builder 
		System.out.println(sb.insert(2,"++++"));
		
	}

}
