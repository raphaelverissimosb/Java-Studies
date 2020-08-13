package br.com.devdojo.introduction.examples.lecture;

public class Lecture {
	private String title;
	private Teacher teacher;
	private Student[] student;
	private Place place;
	
	
	public Lecture() {
		
	}
	
	
	public Lecture(String title, Teacher teacher, Student[] student) {
		super();
		this.title = title;
		this.teacher = teacher;
		this.student = student;
	}
	
	

	public Lecture(String title) {
		super();
		this.title = title;
	}


	//getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setStudent(Student[] student) {
		this.student = student;
	}
	public Student[] getStudent() {
		return student;
	}
	
	public void setPlace(Place place) {
		this.place = place;
	}
	public Place getPlace() {
		return place;
	}
	
	//methods 
	public void print() {
		System.out.println("***Lecture***");
		System.out.println("Title: "+this.title);
	
		if(this.place != null) {
		System.out.println("***Place***");
		System.out.println("Rua :" + this.place.getStreet()+"Neighbor :"+ this.place.getNeighbor());
		}else {
			System.out.println("There is not a place to the lecure");
		}
		
		if(teacher != null) {
		System.out.println("***Teacher Information***");
		System.out.println("Teacher :"+this.teacher.getName());
		System.out.println("Teache :"+ this.teacher.getGraduated());
		}else {
			System.out.println("There is no teacher to this lecture");
		}
		
		System.out.println();
		
		System.out.println("***Students Information***");
		if(student != null && student.length != 0) {
			for(Student stud : student) {
				System.out.println(stud.getName());
			}
			return;
		}else {
			System.out.println("There are not students");
		}
	}
	
}
