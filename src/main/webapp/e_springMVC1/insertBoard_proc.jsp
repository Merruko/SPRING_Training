<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="e_springMVC1.board.impl.BoardDAO"%>
<%@page import="e_springMVC1.board.BoardVO"%>

<%
	//post방식 = request 객체 	
	request.setCharacterEncoding("utf-8");  
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.insertBoard(vo);
	
	response.sendRedirect("getBoardList.jsp");
%>