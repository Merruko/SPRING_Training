<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="e_springMVC1.board.impl.BoardDAO"%>
<%@page import="e_springMVC1.board.BoardVO"%>

<%
	request.setCharacterEncoding("utf-8");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String seq = request.getParameter("seq");
	
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setContent(content);
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.updateBoard(vo);
	
	response.sendRedirect("getBoardList.jsp");
%>