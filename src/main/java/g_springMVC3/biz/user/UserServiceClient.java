package g_springMVC3.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("g_springMVC3/applicationContext.xml");
		UserService userService = (UserService) container.getBean("userService");
		
		// 로그인 기능 테스트 
		UserVO vo = new UserVO();
		vo.setId("user1");
		vo.setPassword("user1");
//		vo.setId(arg[0]);
//		vo.setPassword(arg[1]);
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName()+"님 환영합니다. ");
		} else {
			System.out.println("로그인 실패");
		}
		
		container.close();
	}
}
