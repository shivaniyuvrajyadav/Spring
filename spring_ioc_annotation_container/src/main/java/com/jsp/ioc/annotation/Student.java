package com.jsp.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value = "101")
private int id;
	@Value(value = "ram")
private String name;
	@Value(value = "thane")
private String address;
	@Autowired
private Pen pen;
	@Autowired
private Pencil pencil;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Pen getPen() {
		return pen;
	}
	public Pencil getPencil() {
		return pencil;
	}

}
