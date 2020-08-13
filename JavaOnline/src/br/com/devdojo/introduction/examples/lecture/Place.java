package br.com.devdojo.introduction.examples.lecture;

public class Place {
	private String street;
	private String neighbor;
	private Lecture lecture;
	
	public Place () {
		
	}
	
	
	
	public Place(String street, String neighbor, Lecture lecture) {
		super();
		this.street = street;
		this.neighbor = neighbor;
		this.lecture = lecture;
	}

	

	public Place(String street, String neighbor) {
		super();
		this.street = street;
		this.neighbor = neighbor;
	}



	//getters and setters
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNeighbor() {
		return neighbor;
	}
	public void setNeighbor(String neighbor) {
		this.neighbor = neighbor;
	}
	
	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}
	public Lecture getLecture() {
		return lecture;
	}
	
	
	//methods
	public void print() {
		System.out.println("Street :"+this.street);
		System.out.println("Neighbor :"+this.neighbor);
		System.out.println("Lecture :"+this.lecture.getTitle());
	}
}
