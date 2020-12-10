package com.test.ex2;

public class ExamTest {	// SingleTon 패턴 
	// 싱글톤 클래스 명과 동일한 private static 인스턴스 멤버변수가 있어야함
	// 누구든 가져가야 하기 때문에 public get 메서드가 하나 있어야 됨
	// get 메서드에서는 인스턴스를 반환해야만한다
	// 자바책 194페이지
	
	private static ExamTest instance;
	
	private ExamTest() {
		
	}
	
	public static ExamTest getInstance() {
		if (instance == null) {
			instance = new ExamTest();
		}
		return instance;
	}
	
	public void getMessage() {
		System.out.println("ExamTest.getMessage()......");
	}

}