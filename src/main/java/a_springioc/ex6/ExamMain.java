package a_springIOC.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/a_springIOC/test6.xml");
		JdbcService service1 = (JdbcService) context.getBean("service");
		JdbcService service2 = (JdbcService) context.getBean("service");
			
		service1.serviceTest();
		
	}

}