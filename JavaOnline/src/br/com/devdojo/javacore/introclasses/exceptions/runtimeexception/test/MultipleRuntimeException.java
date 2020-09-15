package br.com.devdojo.javacore.introclasses.exceptions.runtimeexception.test;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultipleRuntimeException {

	public static void main(String[] args) throws SQLException {
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
		
		System.out.println("End");
		
		try {
			maybeThrowException();
		}catch(IOException e) {
			
		}
		
	}
	
	private static void maybeThrowException() throws SQLException, FileNotFoundException {
		
	}

}
