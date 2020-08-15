package br.com.devdojo.javacore.introclasses.enumer.classes;

import br.com.devdojo.javacore.introclasses.enumer.test.CostumerType;

public class Costumer {
	
	private String name;
	private CostumerType typeOf;
	
	
	public Costumer(String name, CostumerType typeOf) {
		super();
		this.name = name;
		this.typeOf = typeOf;
	}
	
	
	
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
		return "Costumer [name=" + name + ", typeOf=" + typeOf + "]";
	}
	
	
	

	
	
	
	
}
