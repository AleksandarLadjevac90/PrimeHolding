package primeSoftware;

import java.util.Scanner;

import javax.management.InvalidAttributeValueException;

import java.util.ArrayList;
import java.util.Date;
public class CashierMain {

	public static void main(String[] args) throws InvalidAttributeValueException {
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
        System.out.println("Hello! Welcome to our store! Today is " + date + " Please pick your product: ");
        
        Store store = new Store(getProductsToInitializeStore());
        ArrayList<Product> storeProducts = store.getProducts();
        
        Cart cart = new Cart();
        cart.addToCart(storeProducts.get(0))
    	.addToCart(storeProducts.get(1))
    	.addToCart(storeProducts.get(2))
    	.addToCart(storeProducts.get(3))
    	.addToCart(storeProducts.get(4));
    
        store.getCashier().pay(cart);
	}
	
	private static ArrayList<Product> getProductsToInitializeStore() throws InvalidAttributeValueException
	{
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(0, new Product(ProductType.Shirt, "Blue Cotton Shirt", "BrandS", 14.99, "blue", ShirtSize.M));
		products.add(1, new Product(ProductType.Shirt, "White Cotton Shirt", "BrandS", 15.99, "white", ShirtSize.M));
		products.add(2, new Product(ProductType.Trouser, "Black Cotton Trousers", "BrandT", 29.99, "white", new JacketsAndTrousersSize(50)));
		products.add(3, new Product(ProductType.Shoe, "Black Leather Shoes", "BrandS", 59.99, "black", new ShoeSize(43)));
		products.add(4, new Product(ProductType.Jacket, "Black Cotton Suit Jacket", "BrandJ", 99.99, "black", new JacketsAndTrousersSize(50)));
		
		return products;
	}
}
