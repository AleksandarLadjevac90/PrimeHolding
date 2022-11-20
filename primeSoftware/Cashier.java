package primeSoftware;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Cashier {
	private static final int numberOfItemsToGetDiscount = 3;
	private static final int amountDiscount = 20;
	
	private static final int discountOnDayInWeek = 2;
	private static final int dayInWeekDiscountForShirts = 10;
	private static final int dayInWeekDiscountForShoes = 25;
	
	public void pay(Cart cart)
	{
		int discountForNumberOfItems = 0;
		float subtotalPrice = 0;
		float totalDiscount = 0;
		float total = 0;
		Receipt receipt = new Receipt();
		
		ArrayList<Product> productsInCart = cart.getProducts();
		if (productsInCart.size() >= numberOfItemsToGetDiscount) {
			discountForNumberOfItems = amountDiscount;
		}
		
		for(Product product : productsInCart) {
			int currentDiscount = 0;
			if (discountOnDayInWeek == Calendar.DAY_OF_WEEK) {
				if (product.getType().equals(ProductType.Shirt)) {
					currentDiscount = Math.max(discountForNumberOfItems, dayInWeekDiscountForShirts);
				}
				
				if (product.getType().equals(ProductType.Shoe)) {
					currentDiscount = Math.max(discountForNumberOfItems, dayInWeekDiscountForShoes);
				}
			} else {
				currentDiscount = discountForNumberOfItems;
			}
			
			receipt.setProductDiscount(product, currentDiscount);
			subtotalPrice += product.getPrice();
			totalDiscount += this.calculateProductDiscountPrice(product, currentDiscount);
			total += this.calculateProductPrice(product, currentDiscount);
		}
		
		receipt.setSubtotal(subtotalPrice);
		receipt.setDiscount(totalDiscount);
		receipt.setTotal(total);
		
		receipt.print();
	}
	
	private float calculateProductPrice(Product product, int discount)
	{
		return (float) (product.getPrice() * (1 - ((float) discount / 100)));
	}
	
	private float calculateProductDiscountPrice(Product product, int discount)
	{
		return (float) (product.getPrice() * ((float) discount / 100));
	}
}
