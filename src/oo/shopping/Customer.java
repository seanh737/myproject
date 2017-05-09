package oo.shopping;

public class Customer {
	int money;
	
	public  Customer(){
		System.out.println("消費金額"+"\t"+"折扣金"+"\t"+"還原金");
		
	}
	
	public void discount(){
		System.out.println("\t"+8000*0.9);
	}
	
}
