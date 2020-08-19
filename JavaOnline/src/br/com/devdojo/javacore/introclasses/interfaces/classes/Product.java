package br.com.devdojo.javacore.introclasses.interfaces.classes;

public class Product implements Taxable , Transportable{
	
	
	private String name;
	private double price;
	private double weigth;
	private double finalPrice;
	private double freightValue;
	
	//Constructors
	public Product(String name, double price, double weigth) {
		super();
		this.name = name;
		this.price = price;
		this.weigth = weigth;
	}
	
	//Getters and Setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	

	public double getFinalPrice() {
		return finalPrice;
	}

	public double getFreightValue() {
		return freightValue;
	}

	
	
	//Methods 
	@Override
	public void calculateShipping() {
		// TODO Auto-generated method stub
		this.freightValue = this.price / weigth * 0.1;
	}
	@Override
	public void calcularFee() {
		// TODO Auto-generated method stub
		this.finalPrice =this.price * TAXES; 
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", weigth=" + weigth + ", finalPrice  taxes =" + finalPrice
				+ ", freightValue=" + freightValue + "]";
	}

	
	
	
	
}
