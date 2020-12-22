<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="e_springMVC1.board.impl.BoardDAO"%>
<%@page import="e_springMVC1.board.BoardVO"%>
<%@page import="java.util.List"%>

<%
	BoardVO vo = new BoardVO();
	BoardDAO boardDAO = new BoardDAO();
	List<BoardVO> boardList = boardDAO.getBoardList(vo);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
</head>
<body>
<center>
	<h1>Board List</h1>
	<h3>테스트님 환영합니다....<br><a href="logout_proc.jsp">Log-out</a></h3>

	<!--  -->
	<form action="getBoardList.jsp" method="post">
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<td align="right">
					<select name="searchCondition">
					<option value="TITLE">TITLE</option>
					<option value="CONTENT">CONTENT</option>
					</select>
					<input name="searchKeyword" type="text"/>
					<input type="submit" value="search"/>
				</td>
			</tr>
		</table>
	</form>
<!-- search 완료 -->	
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr>
			<th bgcolor="orange" width="100">NO.</th>
			<th bgcolor="orange" width="200">TITLE</th>
			<th bgcolor="orange" width="150">WRITER</th>
			<th bgcolor="orange" width="150">REGDATE</th>
			<th bgcolor="orange" width="100">SEQ</th>
		</tr>
		
		<% for(BoardVO board : boardList) { %>
		<tr>
			<td><%= board.getSeq() %></td>
			<td align="left"><a href="getBoard.jsp?seq=<%= board.getSeq() %>"><%= board.getTitle() %></a></td>
			<td><%= board.getWriter() %></td>
			<td><%= board.getRegDate() %></td>
			<td><%= board.getCnt() %></td>
		</tr>
		<% } %>
	</table>
	<br>
	<a href="insertBoard.jsp">새글 등록</a>
</center>
</body>
</html>