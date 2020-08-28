package br.com.devdojo.javacore.introclasses.polimorfism.classes;

public class PaymentReport {
//	
//	
//	public void managerReportPayment(Manager manager) {
//		System.out.println();
//		System.out.println("Processing payment report");
//		manager.paymentCalc();
//		System.out.println();
//		System.out.println("Name " + manager.getName());
//		System.out.println("Salary " + manager.getSalary());
//		
//	}
//	
//	
//	public void saylorReportPayment(Saylor saylor) {
//		System.out.println();
//		System.out.println("Processing payment report");
//		saylor.paymentCalc();
//		System.out.println();
//		System.out.println("Name " + saylor.getName());
//		System.out.println("Salary " + saylor.getSalary());
//	}
//	
	public void genericPayment(Employer employer) {
		System.out.println();
		System.out.println("Processing payment report");
		employer.paymentCalc();
		System.out.println();
		System.out.println("Name " + employer.getName());
		System.out.println("Salary " + employer.getSalary());
		
		if( employer instanceof Manager ) {
			Manager manager = (Manager)employer;
			System.out.println("PNL = "+  manager.getProfitSharing());
		}
		
		if(employer instanceof Saylor) {
			Saylor saylor = (Saylor) employer;
			System.out.println("Total Sales :" + saylor.getTotalSales());
		}
	}
}
