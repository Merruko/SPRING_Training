package h_springMVC4.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import h_springMVC4.biz.user.UserVO;
import h_springMVC4.biz.user.impl.UserDAO;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
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
		ModelAndView mav = new ModelAndView();
		if(user != null) {
//			mav.setViewName("getBoardList.do");
			mav.setViewName("redirect:getBoardList.do");
		} else {
//			mav.setViewName("h_login.jsp");
			mav.setViewName("redirect:h_login.jsp");
		}
		return mav;
	}
}