package oo.mid;

public class Meal {
	String hamburger;
	String drinks;
	int dollar;
	
	public Meal(String hamburger ,String drinks, int dollar){
		this.hamburger = hamburger;
		this.drinks = drinks;
		this.dollar = dollar;
	}
	public void print(){
		System.out.println(hamburger);
		System.out.println(drinks);
		System.out.println(dollar);
		
	}
}
