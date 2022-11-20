package primeSoftware;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Receipt {
	private float subtotal;
	private float discount;
	private float total;
	private HashMap<Product, Integer> productDiscountMap;

	public Receipt() {
		this.productDiscountMap = new HashMap<Product, Integer>();
	}
	public void setProductDiscount(Product product, int discount) {
		this.productDiscountMap.put(product, discount);
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public void setTotal(float total) {
		this.total = total;
	}

	public void print()
	{
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Date: " + dateFormat.format(currentDate));
		System.out.println("---Products---");
		
        for (HashMap.Entry<Product, Integer> set : this.productDiscountMap.entrySet()) {
        	Product product = set.getKey();
        	int discount = set.getValue();
        	
        	System.out.println(product.getName() + " - " + product.getBrand());
        	System.out.printf("%.2f$ \n", this.calculateProductPrice(product, discount));
        	System.out.println("#discount " + discount + "%" + String.format(" %.2f$", this.calculateProductDiscountPrice(product, discount)));

        }
        System.out.println("----------------------------");
		System.out.println("SUBTOTAL: " + "$" + String.format(" %.2f", this.subtotal));
		System.out.println("DISCOUNT: " + "-$" + String.format("%.2f", this.discount));
		System.out.println("TOTAL: " + "$" + String.format("%.2f", this.total));
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
