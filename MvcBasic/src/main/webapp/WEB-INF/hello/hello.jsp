<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HELLO</title>
</head>
<body>
	HELLO :)<br><br>
	
	인사말 : ${greeting}<br>
	메세지 : ${message}<br><br>
	
	<%
		String hohoho = request.getContextPath() + "/first/hohoho.he";
	%>
	
	<a href="<%=hohoho%>">Click!</a>
</body>
</html>