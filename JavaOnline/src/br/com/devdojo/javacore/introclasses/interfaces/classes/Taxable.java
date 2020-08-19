package br.com.devdojo.javacore.introclasses.interfaces.classes;

public interface Taxable {
	// every methods are abstracts and every attributes are constants 
	
	public static final double TAXES = 0.2;
	
	public abstract void calcularFee();
}
