package br.com.devdojo.javacore.introclasses.exceptions.checkedexceptions.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import br.com.devdojo.javacore.introclasses.exceptions.checkedexceptions.classes.ReaderOne;
import br.com.devdojo.javacore.introclasses.exceptions.checkedexceptions.classes.ReaderTwo;

public class TryWithResourcesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile();
	}

	
	public static void readFile() {
	
		try (ReaderOne readerOne = new ReaderOne(); ReaderTwo readerTwo = new ReaderTwo() ){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void readFileOld() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("txt.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(reader != null) {
				reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
