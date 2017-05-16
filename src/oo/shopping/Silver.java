package oo.shopping;

public class Silver extends Customer{
	float discount = 0.1f;
	  	
	 	public Silver(int money){
	 		super(money);
	 	}
	 
	 	@Override
	 	public void print() {
	 		System.out.println(money + "\t" + (money*discount) +"\t0");
	 	}
	 	
}
