package oo.shopping;

public class Golden extends Silver{
	float returnRate = 0.05f;
	
	public Golden(int money) {
		super(money);
	}

	@Override
	public void print() {
		System.out.println(money + "\t" + (money*discount) + "\t" +
						(money*returnRate));
	}


}
