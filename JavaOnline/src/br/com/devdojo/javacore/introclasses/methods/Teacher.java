package br.com.devdojo.javacore.introclasses.methods;

public class Teacher {
  
	public String name;
	public String register;
	public String rg;
	public String cpf;
  
	public void printData() {
		System.out.println(this.name);
		System.out.println(this.cpf);
		System.out.println(this.register);
		System.out.println(this.rg);
		this.name = "Valks";
		System.out.println(this.name);
	}
	
	
	
  
}
