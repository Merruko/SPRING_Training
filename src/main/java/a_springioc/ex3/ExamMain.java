package a_springioc.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/a_springioc/ex3/test3.xml");
		ExamDao exam = (ExamDao) context.getBean("examDao");
		
		exam.printMessage();
		
	}

}