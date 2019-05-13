package grocery;

import java.time.LocalDate;
import java.time.Period;

public abstract class Product {

	private final String productName;
	private final String upc;
	private int quantity;
	private double cost;
	private double sellPrice;
	private LocalDate sellBy;
	private boolean onSale;
	private double discount;
	
	public Product(String productName, String upc, int quantity, double cost, double sellPrice) {
		this.productName = productName;
		this.upc = upc;
		this.quantity = quantity;
		this.cost = cost;
		this.sellPrice = sellPrice;
		this.sellBy = LocalDate.now();
		this.onSale = false;
		this.discount = 0.10;
	}
	
	public Product(String productName, String upc, int quantity, double cost, double sellPrice, LocalDate sellBy) {
		super();
		this.productName = productName;
		this.upc = upc;
		this.quantity = quantity;
		this.cost = cost;
		this.sellPrice = sellPrice;
		this.sellBy = sellBy;
		this.onSale = false;
		this.discount = 0.10;
	}
	
	public String getProductName() {
		return productName;
	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
	public String getUpc() {
		return upc;
	}
//	public void setUpc(String upc) {
//		this.upc = upc;
//	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
//	public void setCost(double cost) {
//		this.cost = cost;
//	}
	public double getSellPrice() {
		return sellPrice;
	}
	protected Product setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
		System.out.println("Sell Price for "+this.productName+ " is now $"+this.sellPrice);
		return this;
	}
	public LocalDate getSellBy() {
		return sellBy;
	}
	public void setSellBy(LocalDate sellBy) {
		this.sellBy = sellBy;
		System.out.println("Sell By Date for "+this.productName+ " is "+this.sellBy);
	}
	public boolean isOnSale() {
		return onSale;
	}
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
		if (onSale) {
			this.sellPrice=this.salePrice();
			System.out.println(String.format(this.productName + " is now being put on sale at $%.2f %n",this.sellPrice));
		}
		else {
			this.sellPrice=Math.round(100.00*this.sellPrice/(1-this.discount))/100.00;
			System.out.println(this.productName + " is now being sold at the original price of $"+this.sellPrice);
		}
	}
	public double getDiscount() {
		return discount;
	}
	public Product setDiscount(double discount) {
		this.discount = discount;
		System.out.println("Discount percentage of "+this.productName+" is now being set to "+discount*100+"%");
		return this;
	}
	
	public int needToBeSoldThisWeek(){
		int items = 0;
		LocalDate today = LocalDate.now();
		System.out.println("Today is "+today);
		Period period = Period.between(today, this.sellBy);
		int diff = period.getDays();
		if (diff < 7) {
			items = this.quantity;
		}
		System.out.println(items + " units of "+this.getProductName()+" will need to be sold this week.");
		return items;
	}
	
	public double purchaseCost() {
		double purchaseCost = this.cost * this.quantity;
		System.out.println(String.format("The purchase cost of "+this.quantity+" units of "+this.productName+" at $"+this.cost+" per unit was $%.2f %n",purchaseCost));
		return purchaseCost;
	}
	
	public double revenue() {
		double revenue = this.sellPrice * this.quantity;
		System.out.println(String.format("The revenue from selling "+this.quantity+" units of "+this.productName+" at $"+this.sellPrice+" per unit will be $%.2f %n",revenue));
		return revenue;
	}
	
	public double profit() {
		double profit = this.revenue()-this.purchaseCost();
		System.out.println(String.format("The profit from selling "+this.quantity+" units of "+this.productName+" will be $%.2f %n",profit));
		return profit;
	}
	
	public double salePrice() {
		double salePrice = this.sellPrice - this.sellPrice*this.discount;
		
		return Math.round(100.00*salePrice)/100.00;
	}

	
}
