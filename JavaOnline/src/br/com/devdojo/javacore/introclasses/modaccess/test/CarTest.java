package br.com.devdojo.javacore.introclasses.modaccess.test;

import br.com.devdojo.javacore.introclasses.modaccess.classes.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(280,"BMW");
		Car car2 = new Car(275,"Audi");
		Car car3 = new Car(291,"Mercedes-Benz");
		
		car1.print();
		car2.print();
		car3.print();
		
	}

}
