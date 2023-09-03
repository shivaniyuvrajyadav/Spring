package com.jsp.ioc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ball {
private int id;
private String color;
private String brand;
public int getId() {
	return id;
}
@Value(value = "101")
public void setId(int id) {
	this.id = id;
}
public String getColor() {
	return color;
}
@Value(value = "black")
public void setColor(String color) {
	this.color = color;
}
public String getBrand() {
	return brand;
}
@Value(value = "ball")
public void setBrand(String brand) {
	this.brand = brand;
}
@PostConstruct
public void load() {
	// TODO Auto-generated method stub
	System.out.println("hello");

}
@PreDestroy
public void unload() {
	// TODO Auto-generated method stub
	System.out.println("bye");

}
}
