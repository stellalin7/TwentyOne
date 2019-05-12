package grocery;

import java.time.LocalDate;

public class Product extends Inventory {
	

	public Product(String productName, String upc, int quantity, double cost, double sellPrice) {
		super(productName, upc, quantity, cost, sellPrice);
		System.out.println(quantity + " units of "+productName+" UPC:"+ upc+" purchased at $"+ cost+" per unit to be sold at $"+sellPrice+" per unit have been added to the inventory.");
		
	}

	


}
