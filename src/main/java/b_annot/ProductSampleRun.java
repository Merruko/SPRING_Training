package b_annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import b_annot.di.business.domain.Product;
import b_annot.di.business.service.ProductService;

public class ProductSampleRun {
	
	public static void main(String[] args) {
		ProductSampleRun productSampleRun = new ProductSampleRun();
		productSampleRun.execute();		
	}

	public void execute() {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("b_annot/config/applicationContext.xml");
	// ClassPath 는 자바부터 경로
	ProductService productService = ctx.getBean(ProductService.class);
	Product product = productService.getProduct();
	System.out.println(product);
	
	}
	
}