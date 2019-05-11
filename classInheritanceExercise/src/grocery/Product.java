package grocery;

import java.time.LocalDate;

public class Product extends Category {
	
	public static double originalPrice;

	public Product(String productName, String upc, int quantity, double cost, double sellPrice) {
		super(productName, upc, quantity, cost, sellPrice);
		originalPrice = sellPrice;
	}

	public static void main(String[] args) {
		Product almondMilk = new Product("Almond Milk","123456789",20,1.75,3.99);
		//System.out.println(almondMilk.toString()+" was added to the inventory.");
		LocalDate almondMilkSellBy = LocalDate.of(2019, 5, 15);
		almondMilk.setSellBy(almondMilkSellBy);
		if (almondMilk.needToBeSoldThisWeek()>0) {
			almondMilk.setDiscount(.20);
			almondMilk.setOnSale(true, originalPrice);
			}
		else {
			almondMilk.setOnSale(false, originalPrice);
		}
		almondMilk.profit();
	}	

}
