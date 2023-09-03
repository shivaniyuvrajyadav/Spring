package org.jsp.spring_ioc_container_injector;

public class Engine {
int eno;
String brand;

public Engine(int eno, String brand) {
	
	this.eno = eno;
	this.brand = brand;
}
 
public void engDetails() {
	System.out.println(eno);
	System.out.println(brand);
}

}
