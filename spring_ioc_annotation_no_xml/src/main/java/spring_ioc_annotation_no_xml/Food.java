package spring_ioc_annotation_no_xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Food {
	@Value(value = "1")
	int id;
	@Value(value = "sheera")
	String name;
	@Value(value = "20")
	double price;
	@Value(value = "mah")
	String origin;
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", price=" + price + ", origin=" + origin + "]";
	}
	
}
