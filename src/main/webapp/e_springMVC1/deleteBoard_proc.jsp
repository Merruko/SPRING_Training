<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="e_springMVC1.board.impl.BoardDAO"%>
<%@page import="e_springMVC1.board.BoardVO"%>

<%
	String seq = request.getParameter("seq");
	
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBoard(vo);
	
	response.sendRedirect("getBoardList.jsp");
%>