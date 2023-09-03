package org.jsp.spring_ioc_container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Pencil_Driver {
	public static void main(String[] args) {
//		J2EE container
//		ApplicationContext context = new ClassPathXmlApplicationContext("pencil.xml");
//		Pencil pencil = (Pencil)context.getBean("mypencil");
//		pencil.price1();
//		pencil.name(2);
//		
		
//		Core container
		Resource resource = new ClassPathResource("pencil.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Pencil pencil = (Pencil) factory.getBean("mypencil");
		pencil.name(3);
		
	}
}
 