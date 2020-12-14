package b_annot.di.dataaccess;

import org.springframework.stereotype.Component;

import b_annot.di.business.domain.Product;
import b_annot.di.business.service.ProductDao;

@Component
public class ProductDaoImpl implements ProductDao {
	
	public Product findProduct() {
		return new Product("연필",100);
	}

} 