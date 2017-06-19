package oo.shopping2;

import java.util.ArrayList;

public abstract class Customer {
	int money;

	public Customer(int money) {
		this.money = money;
	}

	public abstract void print();
}
