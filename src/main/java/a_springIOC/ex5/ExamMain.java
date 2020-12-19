package a_springIOC.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
			
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/a_springIOC/ex5/test5.xml");
		IbatisService service = (IbatisService) context.getBean("service");
			
		service.daoTest();
		
	}
	
}