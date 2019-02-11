package POJO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cars")
@Scope("singleton")
public class Cars {
	private Engine engine;
	@Value("Loda")
	private String carCompany;
	@Value("85763")
	private double price;
	public Engine getEngine() {
		return engine;
	}
	
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getCarCompany() {
		return carCompany;
	}
	
	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
