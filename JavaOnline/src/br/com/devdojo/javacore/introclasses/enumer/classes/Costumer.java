package br.com.devdojo.javacore.introclasses.enumer.classes;

import br.com.devdojo.javacore.introclasses.enumer.test.CostumerType;

public class Costumer {
	
	private String name;
	private CostumerType typeOf;
	private PaymentType paymentType;
	
	
//	public enum CostumerType {
//		JPERSON, FPERSON;
//	}

	//Constructor
	// creating an enumeration inside my class 
	public enum PaymentType{
		CASH_PAYMENT, DEFFERED_PAYMENT;
		
		
		public String getId() {
			return "Active";
		}
	}
	
	public Costumer(String name, CostumerType typeOf) {
		super();
		this.name = name;
		this.typeOf = typeOf;
	}
	
	public Costumer(String name, CostumerType typeOf,PaymentType paymentType) {
		this.name = name;
		this.typeOf = typeOf;
		this.paymentType = paymentType;
		
		
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CostumerType getTypeOf() {
		return typeOf;
	}
	public void setTypeOf(CostumerType typeOf) {
		this.typeOf = typeOf;
	}



	@Override
	public String toString() {
		return "Costumer [name=" + name + ", typeOf=" + typeOf.getName() + "number=" + typeOf.getTypeOf() + "]";
	}
	
	
	

	
	
	
	
}
