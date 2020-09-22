package br.com.devdojo.javacore.introclasses.strings.test;

public class StringPerformanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long initial = System.currentTimeMillis();
		concateString(10000);
		long end = System.currentTimeMillis();	
		System.out.println("Wasted time String " + (end - initial)+ " ms");
		
		initial = System.currentTimeMillis();
		concateStringBuilder(10000);
		end = System.currentTimeMillis();	
		System.out.println("Wasted time String Builder " + (end - initial)+ " ms");
		
		initial = System.currentTimeMillis();
		concateStringBuffer(10000);
		end = System.currentTimeMillis();	
		System.out.println("Wasted time String Builder " + (end - initial)+ " ms");
	}

	private static void concateString(int tam) {
		String string ="";
		
		for(int i = 0 ; i < tam ; i++) {
			string += 1;
		}
	}
	
	
	private static void concateStringBuilder(int tam) {
		
		StringBuilder ab = new StringBuilder(tam);
		
		for(int i = 0 ; i < tam ; i++) {
			ab.append(i);
		}
	}
	
	private static void concateStringBuffer(int tam) {
		//this method is protected to be accessed by multitred 
		StringBuffer ab = new StringBuffer(tam);
		
		for(int i = 0 ; i < tam ; i++) {
			ab.append(i);
		}
	}
}
