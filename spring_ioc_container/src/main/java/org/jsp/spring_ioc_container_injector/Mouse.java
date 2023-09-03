package org.jsp.spring_ioc_container_injector;

public class Mouse {
	
	String brand;
	double price;
	String type;
	public Mouse(String brand, double price, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	
	public void mouseDetails() {
		System.out.println("brand" + brand);
		System.out.println("price" + brand);
		System.out.println("type" + brand);
		
		
		
	}

}
