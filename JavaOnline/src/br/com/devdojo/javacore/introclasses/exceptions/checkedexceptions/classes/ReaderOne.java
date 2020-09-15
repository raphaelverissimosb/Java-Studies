package br.com.devdojo.javacore.introclasses.exceptions.checkedexceptions.classes;

public class ReaderOne implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing reader one!");
	}

	
}
