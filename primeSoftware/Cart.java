package primeSoftware;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> products;

	public Cart() {
		super();
		this.products = new ArrayList<Product>();
	}
	
	public Cart addToCart(Product product)
	{
		this.products.add(product);
		
		return this;
	}

	public ArrayList<Product> getProducts() {
		return products;
	} 
}
