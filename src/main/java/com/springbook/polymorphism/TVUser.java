package com.springbook.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
//		일반적으로 객체 생성하고 메서드 호출
//		
//		SamsungTV tv1 = new SamsungTV();
//		tv1.powerOn();
//		tv1.volumeUp();
//		tv1.volumeDown();
//		tv1.powerOff();
//		
//		LgTV tv2 = new LgTV();
//		tv2.powerOn();
//		tv2.volumeUp();
//		tv2.volumeDown();
//		tv2.powerOff();
		
		
//		인터페이스 이용
//		
//		TV tv1 = new SamsungTV();
//		
//		tv1.powerOn();
//		tv1.volumeUp();
//		tv1.volumeDown();
//		tv1.powerOff();
//		
//		TV tv2 = new LgTV();
//		
//		tv2.powerOn();
//		tv2.volumeUp();
//		tv2.volumeDown();
//		tv2.powerOff();
		
		
//		BeanFactory 이용해서 유지보수 용이하게하기
//		
//		BeanFactory factory = new BeanFactory();
//		
//		TV tv = (TV)factory.getBean(args[0]);
//		
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();

		
//		// 1. Spring 컨테이너를 구동한다.
//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//		
//		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
//		TV tv = (TV)factory.getBean("tv");
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
//		
//		// 3. Spring 컨테이너를 종료한다.
//		factory.close();
		
		
//		// 싱글톤 패턴
//		
//		// 1. Spring 컨테이너를 구동한다.
//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//		
//		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");
//		
//		// 3. Spring 컨테이너를 종료한다.
//		factory.close();
		
		
		// 소니 스피커 쓰기
		
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3. Spring 컨테이너를 종료한다.
		factory.close();
	}

}