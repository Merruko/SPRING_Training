package a_springIOC.sample.di.business.domain;

public class Product {
	
	private String name;
	private int price;
	
	public Product() { }
	
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
		// toString 주석 처리하면 주소값이 반환됨
		return "Product [name=" + name + ", price=" + price + "]";
	}
		
}