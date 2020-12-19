package a_springIOC.annot.di.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import a_springIOC.annot.di.business.domain.Product;

@Component	// 생성할 클래스 위에 쓰는 것
public class ProductServiceImpl implements ProductService {
	@Autowired	// 주입대상 객체 위에 쓰는 것
	private ProductDao productDao;
	
	public Product getProduct() {
		
		return productDao.findProduct();
	
	}

}