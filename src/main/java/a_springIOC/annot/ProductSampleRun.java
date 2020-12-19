package a_springIOC.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import a_springIOC.annot.di.business.domain.Product;
import a_springIOC.annot.di.business.service.ProductService;

public class ProductSampleRun {
	
	public static void main(String[] args) {
		ProductSampleRun productSampleRun = new ProductSampleRun();
		productSampleRun.execute();
	}

	public void execute() {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("a_springIOC/annot/config/applicationContext.xml");
	// ClassPath 는 자바부터 경로
	ProductService productService = ctx.getBean(ProductService.class);
	Product product = productService.getProduct();
	System.out.println(product);
	
	}

}