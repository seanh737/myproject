package oo.shopping2;

public class Normal extends Customer{
	int money;

	public Normal(int money) {
		super(money);
	}
	
	public void print() {
		System.out.println(money + "\t" + money + "\t0");
	}
}
