<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글 등록</title>
</head>
<body>
<center>
<h1>글 등록</h1>
<a href="logout.do">Log-out</a>
<hr>
<form action="insertBoard.do" method="post">
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td bgcolor="orange" width="70">TITLE</td>
			<td align="left"><input name="title" type="text" /></td>
		</tr>
		<tr>
			<td bgcolor="orange">WRITER</td>
			<td align="left"><input name="writer" type="text" size="10"/></td>
		</tr>
		<tr>
			<td bgcolor="orange">CONTENT</td>
			<td align="left"><textarea name="content" cols="40" rows="10"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="글 등록"/>
			</td>
		</tr>
	</table>
</form>
<hr>
<a href="getBoardList.jsp">글 목록 가기</a>
</center>
</body>
</html>