package br.com.devdojo.introduction.examples.lecture;

public class Student {
	private String name;
	private int age;
	private Lecture lecture;
	
	public Student() {
		
	}
	
	
	
	public Student(String name, int age, Lecture lecture) {
		super();
		this.name = name;
		this.age = age;
		this.lecture = lecture;
	}
	
	


	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}
	public Lecture getLecture() {
		return lecture;
	}
	
	//methods 
	
	public void print() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		if(this.lecture != null) {
		System.out.println("title: " +this.lecture.getTitle());
		}else {
			System.out.println("The student do not have the ticket to this lecture!");
		}
	} 
	
	
}
