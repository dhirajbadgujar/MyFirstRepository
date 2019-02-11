package POJO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.AppConfig;

public class Toyoto {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Cars cars = (Cars) context.getBean("cars");
		System.out.println(cars.getEngine().getConfg());
		System.out.println(cars.getPrice());
		System.out.println(cars.getCarCompany());
		
	}
}
