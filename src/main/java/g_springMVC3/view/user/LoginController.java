package g_springMVC3.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import g_springMVC3.biz.user.UserVO;
import g_springMVC3.biz.user.impl.UserDAO;
import g_springMVC3.view.controller.Controller;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("로그인 처리");
		
//		1) 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
//		2) DB연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(pw);
		
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		
//		3) 화면 네비게이션 
		if(user != null) {
			return "getBoardList.do";
		} else {
			return "login";
		}
	}
}
