<%@page import="e_springMVC1.user.impl.UserDAO"%>
<%@page import="e_springMVC1.user.UserVO"%>
<%@page contentType="text/html; charset=UTF-8"%>

<%
	// 사용자의 입력정보 추출
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// DB연동처리
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(pw);
	
	UserDAO userDAO = new UserDAO();
	UserVO user = userDAO.getUser(vo);
	
	if(user != null){
		response.sendRedirect("getBoardList.jsp");
	} else {
		response.sendRedirect("login.jsp");
	}
%>
