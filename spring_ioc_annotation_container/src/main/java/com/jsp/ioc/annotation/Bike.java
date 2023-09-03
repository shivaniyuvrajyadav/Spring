package com.jsp.ioc.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	@Value(value = "101")
int id;
	@Value(value = "hero")
String name;
	@Value(value = "black")
String color;
	@Value(value = "splender")
String brand;
	
	public void bikeDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(color);
		System.out.println(brand);
	}

}
