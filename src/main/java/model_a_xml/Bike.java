package model_a_xml;

public class Bike {
	
	String brand;
	int cc;
	public Bike(String brand, int cc) {
		super();
		this.brand = brand;
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", cc=" + cc + "]";
	}
}
