package oo.shopping2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		System.out.println("金額"+"\t"+"折扣金"+"\t"+"還原金");

		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Normal(6000));
		list.add(new Silver(8000));
		list.add(new Golden(10000));
		list.add(new Golden(15000));
		list.add(new Silver(1000));
		list.add(new Normal(6000));
		for (int i = 0; i < list.size(); i++) {
			Customer cust = list.get(i);
			
			
			cust.print();
		}
		}


	
}
