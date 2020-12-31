package i_springMVC5.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import i_springMVC5.biz.user.UserVO;
import i_springMVC5.biz.user.impl.UserDAO;

@Controller
public class LoginController {

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginView(@ModelAttribute("user") UserVO vo) {
		System.out.println("로그인 화면으로 이동...");
		vo.setId("test");
		vo.setPassword("test123");
		return "i_login.jsp";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		if (vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
		}
		UserVO user = userDAO.getUser(vo);
		if (user != null) {
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		} else
			return "i_login.jsp";
	}
}