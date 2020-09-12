package br.com.devdojo.javacore.introclasses.exceptions.runtimeexception.test;

public class MultipleRuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
	}

}
