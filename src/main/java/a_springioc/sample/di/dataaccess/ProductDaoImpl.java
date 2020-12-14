package a_springioc.sample.di.dataaccess;

import a_springioc.sample.di.business.domain.Product;
import a_springioc.sample.di.business.service.ProductDao;

public class ProductDaoImpl implements ProductDao {
	
	public Product getProduct() {
		System.out.println("ProductDaoImpl 클래스의 getProduct() 메소드 호출");
		return new Product("연필", 100);
	}

}