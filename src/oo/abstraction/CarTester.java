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
		int i =0;
		for (int i1 =0; i1<3; i1++){
			System.out.println(cars[i1].name);
		}
		System.out.println(i);
//		for (int i1 =1; i1<=9; i1=i1+2){
//			System.out.println(i1);
//		}
//		System.out.println(i);
	}
	
	class AA {
		
	}
	AA a = new AA();

}
