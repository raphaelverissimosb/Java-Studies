package br.com.devdojo.javacore.introclasses.exceptions.checkedexceptions.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		
		createFile();
	}
	
	public static void createFile() {
		File file = new File("Test.txt");
		try {	
			System.out.println("File Createed Successfully ?" + file.createNewFile());
			System.out.println("File Created!!!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
