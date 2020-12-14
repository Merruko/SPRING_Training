package a_springioc.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import a_springioc.sample.di.business.domain.Product;
import a_springioc.sample.di.business.service.ProductService;

public class ProductSampleRun {
	
	public static void main(String[] args) {
		ProductSampleRun productSampleRun = new ProductSampleRun();
		productSampleRun.execute();
	}
	
	public void execute() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/a_springioc/sample/config/applicationContext.xml");
		// ClassPath는 java부터 경로임
		ProductService productService = ctx.getBean(ProductService.class);
		Product product = productService.getProduct();
		
		System.out.println(product);
		
	}

}