package oo.abstraction;

public class CoffeebeansTester {

	public static void main(String[] args) {
		Coffeebeans CB1 = new Coffeebeans("Arabica","East Timor","mellow",2000,"Full City Roast");
		CB1.name = "Arabica";
		CB1.origin = "East Timor";
		CB1.Flavor = "mellow";
		CB1.altitude = 2000;
		CB1.roast = "Full City Roast";
		
		Coffeebeans CB2 = new Coffeebeans("Robusta","Indonesia Java","Bitter",200,"Full City Roast");
		CB2.name = "Robusta";
		CB2.origin = "Indonesia Java";
		CB2.Flavor = "Bitter";
		CB2.altitude = 200;
		CB2.roast = "Full City Roast";
		
	}

}
