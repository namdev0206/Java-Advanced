<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<div style="text-align: center">
		<%
		String name = request.getParameter("str");
		%>
		<h1>
			Hello
			<%=name%>
		</h1>
	</div>
</body>
</html>