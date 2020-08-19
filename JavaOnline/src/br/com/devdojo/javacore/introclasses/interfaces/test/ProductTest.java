package br.com.devdojo.javacore.introclasses.interfaces.test;

import br.com.devdojo.javacore.introclasses.interfaces.classes.Product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product("Notebook",3000, 4.5);
		product.calcularFee();
		product.calculateShipping();
		
		System.out.println(product);
	}

}
