package br.com.devdojo.javacore.introclasses.enumer.test;

public enum CostumerType {
	JPERSON(1, "JPerson"), FPERSON(2,"FPerson"){
		public String getId() {
			return "B";
		}
	};
	
	private int typeOf;
	private String name;
	
	CostumerType (int  typeOf, String name){
		this.typeOf = typeOf;
		this.name =  name;
	}
	
	// constant specific class body
	
	public String getId() {
		return "A";
	}
	

	public int getTypeOf() {
		return typeOf;
	}

	public String getName() {
		return name;
	}
	
}
