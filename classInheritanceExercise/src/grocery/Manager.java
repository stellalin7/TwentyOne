package grocery;

import java.time.LocalDate;

public class Manager {

	public static void main(String[] args) {
		NonDairy almondMilk = new NonDairy("Almond Milk","123456789",20,1.75,3.99);
		Cheese mascarpone = new Cheese("mascarpone","000000009",5,2.75,5.99);
		LocalDate almondMilkSellBy = LocalDate.of(2019, 5, 25);
		almondMilk.setSellBy(almondMilkSellBy);
		if (almondMilk.needToBeSoldThisWeek()>0) {
			almondMilk.setDiscount(.20);
			almondMilk.setOnSale(true);
			}
		almondMilk.profit();
		LocalDate mascarponeSellBy = LocalDate.of(2019, 5, 15);
		mascarpone.setSellBy(mascarponeSellBy);
		if (mascarpone.needToBeSoldThisWeek()>0) {
			mascarpone.setDiscount(.10);
			mascarpone.setOnSale(true);
			}
		mascarpone.profit();
		mascarpone.setSellPrice(6.59);
		mascarpone.profit();
		
	}

}
