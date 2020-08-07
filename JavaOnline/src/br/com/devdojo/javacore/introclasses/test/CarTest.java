package br.com.devdojo.javacore.introclasses.test;

import br.com.devdojo.javacore.introclasses.Car;

public class CarTest {

	public static void main(String[] args) {
		// 
		
		Car car = new Car();
		car.board = "ABC1425";
		car.model = "Ducato";
		car.maxSpeed = 350.00f;
		
		System.out.println(car.model);
		System.out.println(car.board);
		System.out.println(car.maxSpeed);
		
	}

}
