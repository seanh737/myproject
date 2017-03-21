package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota", 1800, "Altis", "Sedan");
//		c1.brand = "Toyota";
//		c1.name = "Altis";
//		c1.cc = 1800;
//		c1.type = "Sedan";
		Car c2 = new Car("HONDA", 2000, "ACCORD", "Sedan");
		Car c3 = new Car("Toyota", 2000, "WISH", "Sedan");
		
		
		int[] n = new int [5];
		System.out.println(n[3]);
		
		
		Car[] cars = new Car[3];
		System.out.println(cars[0]);
		cars[0] = new Car("Toyota", 1800, "Altis", "Sedan");
		cars[1] = new Car("HONDA", 2000, "ACCORD", "Sedan");
		cars[2] = new Car("Toyota", 2000, "WISH", "Sedan");
		System.out.println(cars[0].name);
		for (int i =0; i<3; i++){
			System.out.println(cars[i].name);
		}
		System.out.println(i);
		for (int i =1; i<=9; i=i+2){
			System.out.println(i);
		}
		System.out.println(i);
	}
	
	class AA {
		
	}
	AA a = new AA();

}
