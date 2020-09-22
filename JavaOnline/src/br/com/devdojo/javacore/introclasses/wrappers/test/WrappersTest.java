package br.com.devdojo.javacore.introclasses.wrappers.test;

public class WrappersTest {

	public static void main(String[] args) {
		
	
	Byte byteWrapper = 1;
	Short shortWrapper = 1;
	Integer intergerWrapper = 1;
	Long longWrapper = Long.valueOf("10");
	Float floatWrapper = 10F;
	Double doubleWrapper = 10D;
	Character characterWrappper = 'A';
	Boolean booleanWrapper = true;
	
	int i = intergerWrapper;
	//unbox
	
	String valueF = "10";
	Float f = Float.parseFloat(valueF);
	System.out.println(f);
	
	System.out.println(Character.isDigit('1'));
	System.out.println(Character.isLetter('h'));
	System.out.println(Character.isLetterOrDigit('%'));
	System.out.println(Character.isLowerCase('h'));
	System.out.println(Character.isUpperCase('H'));
	System.out.println(Character.toUpperCase('h'));
	
	
	}
}
