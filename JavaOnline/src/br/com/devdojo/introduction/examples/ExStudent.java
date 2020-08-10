package br.com.devdojo.introduction.examples;

public class ExStudent {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setName("Raphael"); 
		student.setAge(28);

		double [] arr = {10,5,8};
		student.setGrade(arr);

		System.out.println(student.getName());
		System.out.println(student.getAge());
		//System.out.println(student.getGrade());
		System.out.println(student.isApproved());
		
		
		
		//student.printData(student);
		
	}

}
