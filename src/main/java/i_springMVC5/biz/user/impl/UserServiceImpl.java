package i_springMVC5.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import i_springMVC5.biz.user.UserService;
import i_springMVC5.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
}
