package org.jsp.spring_ioc_container_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Eng_Driver {
 public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext();
	Car car = (Car)context.getBean("car");
	car.carDetails();
	car.engine.engDetails();
}
}
