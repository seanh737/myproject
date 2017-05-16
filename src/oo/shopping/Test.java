package oo.shopping;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		System.out.println("金額"+"\t"+"折扣金"+"\t"+"還原金");

		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new Silver(8000));
		list.add(new Golden(10000));
		list.add(new Golden(15000));
		list.add(new Silver(1000));
		list.add(new Customer(6000));
//		for (int i = 0; i < list.size(); i++) {
//			Customer cust = list.get(i);
			for (Customer cust : list){
			if (cust instanceof Silver && !(cust instanceof Golden)) {
				System.out.print("*");
				Silver silver = (Silver)cust;
			}
			cust.print();
		}
//		}

		String[] array = { "aa", "bb", "cc" };
		for (String s : array) {
			System.out.println(s);
		}
		for (int i = 0; i < array.length; i++) {
			String s = array[i];
			System.out.println(s);
		}

	}
}
