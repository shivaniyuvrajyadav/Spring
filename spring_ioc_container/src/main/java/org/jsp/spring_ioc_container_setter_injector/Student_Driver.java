package org.jsp.spring_ioc_container_setter_injector;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Driver {
public static void main(String[] args) {
//	ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
//	Student student = (Student)context.getBean("mystudent");
//	System.out.println(student.getId());
//	System.out.println(student.getNme());
//	System.out.println(student.getPercentage());
//	System.out.println(student.getAddress());
//	
	ApplicationContext context2 = new ClassPathXmlApplicationContext("student.xml");
	Student student = (Student)context2.getBean("mystudent");
	
	System.out.println(student.getNme());
	((AbstractApplicationContext) context2).close();
	
}
}
