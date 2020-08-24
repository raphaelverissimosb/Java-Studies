package br.com.devdojo.javacore.introclasses.polimorfism.test;

import br.com.devdojo.javacore.introclasses.polimorfism.classes.Manager;
import br.com.devdojo.javacore.introclasses.polimorfism.classes.PaymentReport;
import br.com.devdojo.javacore.introclasses.polimorfism.classes.Saylor;

public class PolimorfismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager("Marcos",5000,2500);
		
		Saylor saylor = new Saylor("Yuri",2000,20000);
		
		PaymentReport paymentReport = new PaymentReport();
		
		paymentReport.managerReportPayment(manager);
		paymentReport.saylorReportPayment(saylor);
		
		
	}

}
