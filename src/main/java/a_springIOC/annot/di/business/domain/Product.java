package a_springIOC.annot.di.business.domain;

public class Product {

	private String name;
	private int price;
	
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
	return "Product [name=" + name + ", price=" + price + "]";
	}
	
}