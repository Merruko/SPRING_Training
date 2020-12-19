package d_springDBCP.user.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import d_springDBCP.user.UserService;
import d_springDBCP.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;

//@Autowired가 있으므로 setter가 필요없다.	
//	public void setUserDAO(UserDAO userDAO) {
//		this.userDAO = userDAO;
//	}

	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	
}
