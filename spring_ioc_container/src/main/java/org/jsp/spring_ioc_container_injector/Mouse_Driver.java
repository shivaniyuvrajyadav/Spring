package org.jsp.spring_ioc_container_injector;

import org.jsp.spring_ioc_container.Pen;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mouse_Driver {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("mouse.xml");
	Mouse mouse = (Mouse)context.getBean("mouse");
	mouse.mouseDetails();
}
}
