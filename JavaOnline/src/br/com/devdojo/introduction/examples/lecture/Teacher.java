package br.com.devdojo.introduction.examples.lecture;



public class Teacher {
	private String name;
	private String graduated;
	private Lecture[] lecture;
	
	public Teacher() {
		
	}
	
	
	public Teacher(String name, String graduated, Lecture[] lecture) {
		super();
		this.name = name;
		this.graduated = graduated;
		this.lecture = lecture;
	}
	

	public Teacher(String name, String graduated) {
		super();
		this.name = name;
		this.graduated = graduated;
	}


	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGraduated() {
		return graduated;
	}
	public void setGraduated(String graduated) {
		this.graduated = graduated;
	}
	
	public void setLecture(Lecture lecture[]) {
		this.lecture = lecture;
	}
	public Lecture[] getLecture() {
		return lecture;
	}
	
	//methods 
	public void print() {
		System.out.println("Name :"+this.name);
		System.out.println("Graduated :"+this.graduated);
		if(lecture != null && lecture.length != 0 ) {
		
			for(Lecture lec : lecture) {
			System.out.println("Lecture name :" +lec.getTitle());
			}
			return;
		}
		System.out.println("There is not lecture");
		
	}
		
	
	
	
}
