package com.jsp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
	
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
Food food = context.getBean(Food.class,"food");
System.out.println(food);

	}
}
