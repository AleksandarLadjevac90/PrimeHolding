package primeSoftware;

public class Product {
	private ProductType type;
	private String name;
	private String brand;
	private double price;
	private String color;
	private Size size;

	public Product(ProductType type, String name, String brand, double price, String color, Size size) {
		super();
		this.type = type;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
	}

	public ProductType getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public Size getSize() {
		return size;
	}
}
