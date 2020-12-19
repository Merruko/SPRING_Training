package c_springAOP.common;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {
	public void printLog(JoinPoint jp) {
		String jpstr = jp.getSignature().getName();
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작: jpstr "+ jpstr);
	}
}