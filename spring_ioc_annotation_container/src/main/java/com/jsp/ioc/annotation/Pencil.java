package com.jsp.ioc.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
int id;
String brand;
double price;
public Pencil(@Value(value="111")int id,@Value(value="apsara") String brand,@Value(value="5") double price) {
	
	this.id = id;
	this.brand = brand;
	this.price = price;
}
public void pencilDetails() {
	System.out.println(id);
	System.out.println(brand);
	System.out.println(price);
	
}


}
