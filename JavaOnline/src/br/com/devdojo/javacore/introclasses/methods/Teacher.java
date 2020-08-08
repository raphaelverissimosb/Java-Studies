package br.com.devdojo.javacore.introclasses.methods;

public class Teacher {
  
	public String name;
	public String register;
	public String rg;
	public String cpf;
  
	public void printData(Teacher teacher) {
		System.out.println(teacher.name);
		System.out.println(teacher.cpf);
		System.out.println(teacher.register);
		System.out.println(teacher.rg);
	}
	
  
}
