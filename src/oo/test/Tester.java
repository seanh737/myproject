package oo.test;

import java.util.ArrayList;

import oo.abstraction.Car;;

public class Tester {

	public static void main(String[] args) {
		Car c = new Car("AA", 2000,"BB","CC");
		
		ArrayList a = new ArrayList();
		
		a.add("331");
		a.add("821");
//		a.add(123);
		a.add("886");
		a.add(true);
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.addAll(a);
		a.set(2, "885");
		System.out.println(a.size());
		System.out.println(a);
		String data = (String)a.get(0);
//		int n = (int)a.get(4);
	}

}
