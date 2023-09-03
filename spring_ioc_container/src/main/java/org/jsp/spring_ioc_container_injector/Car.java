package org.jsp.spring_ioc_container_injector;

public class Car {
	String name;
	String color;
	double price;
	Engine engine;
	
	public Car(String name, String color, double price, Engine engine) {
		
		this.name = name;
		this.color = color;
		this.price = price;
		this.engine = engine;
	}
	
	public void carDetails() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		System.out.println(engine);
	}

}
