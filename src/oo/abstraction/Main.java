package oo.abstraction;

public class Main {

	public static void main(String[] args) {
		Car c = new Car("AA" ,2000,"BB", "CC");
		c.setMilage(25000);
		
		float current = c.addMilage(80);
		System.out.println("目前里程為:" +current);
	}

}
