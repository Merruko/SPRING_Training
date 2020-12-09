package com.springbook.polymorphism;

public class LgTV implements TV {
	
	public void powerOn() {
		System.out.println("LgTV --- 전원 온");
	}
	
	public void powerOff() {
		System.out.println("LgTV --- 전원 오프");
	}
	
	public void volumeUp() {
		System.out.println("LgTV --- 볼륨 업");
	}
	
	public void volumeDown() {
		System.out.println("LgTV --- 볼륨 다운");
	}
	
}