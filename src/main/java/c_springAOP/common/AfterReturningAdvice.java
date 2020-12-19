package c_springAOP.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

import c_springAOP.user.UserVO;

public class AfterReturningAdvice {
	
	public void afterLog(JoinPoint jp, Object returnObj) {
		//Signature method = jp.getSignature();
		String method = jp.getSignature().getName();
		
		//추가한 구문
		String str = jp.getSignature().toLongString();	
		
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			
			if(user.getRole().equals("Admin")) {
				System.out.println(user.getName() + "로그인(Admin)");
			}
		}
		
		
		System.out.println("[사후 처리] "+method+"()메소드 리턴값: "+returnObj.toString()+" / jp.getSignature().toLongString(): "+str);
	}
}
