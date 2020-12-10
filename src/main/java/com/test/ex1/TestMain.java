package com.test.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/test.xml");
				
		TestDao testDao = (TestDao) context.getBean("TestDaoImp");
		
		System.out.println("START.....");
		testDao.printMessage();
		System.out.println("END.....");
	
	}
}