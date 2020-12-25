<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
</head>
<body>
<center>
	<h1>Board List</h1>
	<h3>테스트님 환영합니다....<br><a href="logout.do">Log-out</a></h3>

	<!-- search 시작 -->
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
		<c:forEach items="${boardList }" var="board">	
		<tr>
			<td>${board.seq }</td>
			<td align="left"><a href="getBoard.do?seq=${board.seq }">${board.title }</a></td>
			<td>${board.writer }</td>
			<td>${board.regDate }</td>
			<td>${board.cnt }</td>
		</tr>
		</c:forEach>	
	</table>
	<br>
	<a href="h_insertBoard.jsp">새글 등록</a>
</center>
</body>
</html>