package com.test.ex2;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// *bean 생성의 두가지 방법
		
		// 1. 경로가 필요가 없는 경우
		// AbstractApplicationContext context = new GenericXmlApplicationContext(text.xml);
		
		// 2. 파일의 경로를 서술해야 함
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/test2.xml");
		
		ExamTest examTest = (ExamTest) context.getBean("exam");
		
		examTest.getMessage();
		
	}
}