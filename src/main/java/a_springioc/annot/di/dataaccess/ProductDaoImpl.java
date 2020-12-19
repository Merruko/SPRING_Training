package a_springIOC.annot.di.dataaccess;

import org.springframework.stereotype.Component;

import a_springIOC.annot.di.business.domain.Product;
import a_springIOC.annot.di.business.service.ProductDao;

@Component
public class ProductDaoImpl implements ProductDao {
	
	public Product findProduct() {
		return new Product("연필",100);
	}

} 