package primeSoftware;

import java.util.ArrayList;

public class Store {
	private ArrayList<Product> products;
	private Cashier cashier;
	
	public Store(ArrayList<Product> products) 
	{
		this.products = products;
		this.cashier = new Cashier();
	}
	
	public ArrayList<Product> getProducts()
	{
		return this.products;
	}

	public Cashier getCashier() {
		return cashier;
	}
}
