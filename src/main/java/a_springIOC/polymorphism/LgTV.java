package a_springIOC.polymorphism;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
//	@Autowired - byType(변수의타입=자료형) @Qualifier("apple")
//	@Resource(name="apple") - byName(변수의 이름=bean id)
//	@Inject - byType(변수의타입=자료형) @Named("apple") 동일 기능
	
	@Autowired
	private Speaker speaker;
	public LgTV() {
		System.out.println("LgTV--객체생성");
	}
	
	public void powerOn() {
		System.out.println("LgTV---turn on");
	}
	
	public void powerOff() {
		System.out.println("LgTV---turn off");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}

}