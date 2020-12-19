package a_springIOC.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
//		
//		LgTV tv2 = new LgTV();
//		tv2.powerOn(); //tv2.turnOn();
//		tv2.volumeUp(); //tv2.soundUp();
//		tv2.volumeDown(); //tv2.soundDown();
//		tv2.powerOff(); // tv2.turnOff();
//		
//		TV tv3 = new SamsungTV();  //묵시적 형변환 
//		tv3.powerOn();
//		tv3.volumeUp();
//		tv3.volumeDown();
//		tv3.powerOff();
//		
//		TV tv4 = new LgTV();
//		tv4.powerOn();
//		tv4.volumeUp();
//		tv4.volumeDown();
//		tv4.powerOff();
		
//		BeanFactory factory = new BeanFactory();
//		TV tv  = (TV)factory.getBean(args[0]);  //Object
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
//		//1. spring 컨테이너를 구동 
		AbstractApplicationContext factory = new GenericXmlApplicationContext("a_springIOC/applicationContext.xml");
		
//		//2. spring 컨테이너로부터 필요한 객체를 요청 
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3.컨테이너를 종료한다
		factory.close();
		
//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");
		
	}
}