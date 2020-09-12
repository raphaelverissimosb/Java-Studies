package br.com.devdojo.javacore.introclasses.exceptions.checkedexceptions.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		
	
			openFiles();
	
	}
	
	public static void createFiles() throws IOException {
		
		File file = new File("Test.txt");
		try {
			System.out.println("File created ? " + file.createNewFile());
			System.out.println();
		}catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static String openFiles() {
	
		try {
			System.out.println("Open files");
			System.out.println("Reading files");
			return "value";
		}catch (Exception e) {
			System.out.println("Inside the catch!!!");
			e.printStackTrace();
		}finally {
			System.out.println("close the file");
		}
		
		return null;
	}
}
