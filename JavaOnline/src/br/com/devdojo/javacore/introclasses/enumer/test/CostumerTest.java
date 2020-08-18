package br.com.devdojo.javacore.introclasses.enumer.test;

import br.com.devdojo.javacore.introclasses.enumer.classes.Costumer;
import br.com.devdojo.javacore.introclasses.enumer.classes.Costumer.PaymentType;

public class CostumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Costumer costumer = new Costumer("Ana", CostumerType.FPERSON, PaymentType.CASH_PAYMENT);
		
		System.out.println(costumer);
	}

}
