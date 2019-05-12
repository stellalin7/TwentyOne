package grocery;

import java.time.LocalDate;

public class Manager {

	public static void main(String[] args) {
		Product almondMilk = new Product("Almond Milk","123456789",20,1.75,3.99);
		LocalDate almondMilkSellBy = LocalDate.of(2019, 5, 25);
		almondMilk.setSellBy(almondMilkSellBy);
		if (almondMilk.needToBeSoldThisWeek()>0) {
			almondMilk.setDiscount(.20);
			almondMilk.setOnSale(true);
			}
		almondMilk.profit();
	}

}
