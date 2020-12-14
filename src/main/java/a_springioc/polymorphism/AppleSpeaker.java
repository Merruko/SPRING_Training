package a_springioc.polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("===>applespeaker 객체 생성");
	}
	public void volumeUp() {
		System.out.println("applespeaker---소리올린다");
	}
	public void volumeDown() {
		System.out.println("applespeaker---소리내린다");
	}
}