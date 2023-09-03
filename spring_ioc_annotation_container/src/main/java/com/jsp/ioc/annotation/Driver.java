package com.jsp.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
//	ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
	Bike bike = (Bike) context.getBean("bike");
	bike.bikeDetails();
	
	Pen pen = (Pen)context.getBean("pen");
	pen.penDetails();
	
	Pen pen2 = context.getBean(Pen.class, "cow");
	System.out.println("==============================================");
	pen2.penDetails();
	
	Pencil pencil = context.getBean(Pencil.class, "pencil");
	System.out.println("==============================================");
	pencil.pencilDetails();
	
	Ball ball = context.getBean(Ball.class, "myball");
	
	System.out.println("==============================================");
	
	System.out.println(ball.getId());
	System.out.println(ball.getColor());
	System.out.println(ball.getBrand());
	
	System.out.println("==============================================");
    Student student = context.getBean(Student.class, "student");
    System.out.println(student.getId());
    System.out.println(student.getName());
    System.out.println(student.getAddress());
    System.out.println(student.getPen());
    System.out.println(student.getPencil());
    context.close();
    
    
}
}
