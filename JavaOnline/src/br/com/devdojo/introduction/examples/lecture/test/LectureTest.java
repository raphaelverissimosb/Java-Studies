package br.com.devdojo.introduction.examples.lecture.test;

import br.com.devdojo.introduction.examples.lecture.Lecture;
import br.com.devdojo.introduction.examples.lecture.Place;
import br.com.devdojo.introduction.examples.lecture.Student;
import br.com.devdojo.introduction.examples.lecture.Teacher;

public class LectureTest {

	public static void main(String[] args) {
		
		Student student = new Student("Raphael",28);
		Student student1 = new Student("Leonardo",25);
		
		Lecture lecture = new Lecture("How to be a developer 10.0");
		Teacher teacher = new Teacher("Flavio Oliva","ADM");
		Place place = new Place("Araras Street", "Alameda dos Anjos");
		
		student.setLecture(lecture);
		student1.setLecture(lecture);
		
		lecture.setTeacher(teacher);
		lecture.setPlace(place);
		
		lecture.setStudent(new Student [] {student, student1});

		
		teacher.setLecture(new Lecture[] {lecture}); 
		
		
		lecture.print();

	}

}
