package a_springIOC.polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SamsungTV implements TV{
	
	private Speaker speaker;	//인터페이스라서 아무것도 없지만 상속된 애들을 가리키게 된다 
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체생성");
	}
	
	public SamsungTV(Speaker speaker){
		System.out.println("===> SamsungTV(2) 객체생성");
		this.speaker = speaker;
	}
	
//	public void initMethod() {
//		System.out.println("객체 초기화 작업 처리...");
//	}
//	
//	public void destroyMethod() {
//		System.out.println("객체 삭제 전에 처리할 로직 처리...");
//	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice 호출");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV---turn on (price: "+price+")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV---turn off");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}