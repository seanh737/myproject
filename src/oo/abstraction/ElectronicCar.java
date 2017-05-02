package oo.abstraction;

public class ElectronicCar extends Car {

	public ElectronicCar(String brand, int cc, String name, String type) {
		super(brand, cc, name, type);
		this.brand = brand;
		this.cc = cc;
		this.name = name;
		this.type = type;
	}

}
