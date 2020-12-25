package i_springMVC5.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import i_springMVC5.biz.user.UserService;
import i_springMVC5.biz.user.UserVO;

@Component("userService") // @Service("userService")로도 가능 
public class UserServiceImpl implements UserService {
	@Autowired	//byType이기 때문에 생성자나, setter가 없어도 자료를 찾아서 알아서 주입합니다. 
	private UserDAO userDAO;
	
	//@Autowired가 있으므로 setter가 필요없다 
//	public void setUserDAO(UserDAO userDAO) {
//		this.userDAO = userDAO;
//	}
	
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
}
