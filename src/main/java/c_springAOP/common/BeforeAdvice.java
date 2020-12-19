package c_springAOP.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class BeforeAdvice {

	public void beforeLog(JoinPoint jp) {
		Signature method = jp.getSignature();
		String method1 = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		//추가한 구문
		Object obj = jp.getTarget();
		
		//추가한 구문
		System.out.println("[사전 처리]"+method+"/ method1: "+method1+" 메소드 \n ARGS 정보: "+args[0].toString()+"\n jp.getTarget() : "+ obj);
	}
}
