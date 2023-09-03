package com.jsp.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student1 {
int sid;
String name;
String address;


@Autowired
Pen pen;
@Autowired
Pencil pencil;

@Autowired
public Student1(@Value(value = "101")int  sid,@Value(value = "shivani") String name, @Value(value = "sewri") String address ) {
	
	this.sid = sid;
	this.name = name;
	this.address = address;
}

public void student1Details() {
	System.out.println(sid);
	System.out.println(name);
	System.out.println(address);
}


}
