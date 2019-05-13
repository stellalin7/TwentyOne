package grocery;

import java.time.LocalDate;

public class NonDairy extends Product {
	

	public NonDairy(String productName, String upc, int quantity, double cost, double sellPrice) {
		super(productName, upc, quantity, cost, sellPrice);
		System.out.println(quantity + " units of "+productName+" UPC:"+ upc+" purchased at $"+ cost+" per unit to be sold at $"+sellPrice+" per unit have been added to the inventory.");
		
	}

	public NonDairy(String productName, String upc, int quantity, double cost, double sellPrice, LocalDate sellBy) {
		super(productName, upc, quantity, cost, sellPrice, sellBy);
		System.out.println(quantity + " units of "+productName+" UPC:"+ upc+" with sell-by date "+sellBy+" purchased at $"+ cost+" per unit to be sold at $"+sellPrice+" per unit have been added to the inventory.");
		
	}


}
