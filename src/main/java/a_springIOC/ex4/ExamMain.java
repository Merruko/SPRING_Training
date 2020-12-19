package a_springIOC.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/a_springIOC/ex4/test4.xml");
		JdbcService service = (JdbcService) context.getBean("service");
		
		service.serviceTest();
	}

}