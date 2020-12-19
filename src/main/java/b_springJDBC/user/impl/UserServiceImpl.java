package b_springJDBC.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import b_springJDBC.user.UserService;
import b_springJDBC.user.UserVO;

@Component("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
// @AutoWired가 있으므로 setter 가 필요없다.
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}