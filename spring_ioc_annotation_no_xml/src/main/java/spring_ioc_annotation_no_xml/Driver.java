package spring_ioc_annotation_no_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable;

public class Driver {
	public static void main(String[] args) {
	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	 Food food = context.getBean(Food.class,"food");
	 System.out.println(food);
	}
}
