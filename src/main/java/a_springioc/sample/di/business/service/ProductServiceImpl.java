package a_springIOC.sample.di.business.service;

import a_springIOC.sample.di.business.domain.Product;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao;
	
	public Product getProduct() {
		System.out.println("ProductServiceImpl 클래스의 getProduct() 메소드 호출");
		return productDao.getProduct();
	}
	
	public void setProductDao (ProductDao productDao) {
		this.productDao = productDao;
	}
		
}