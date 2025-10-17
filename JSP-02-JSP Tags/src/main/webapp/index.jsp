<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!
	//Declaration Tag(Declare Variables and Meethods)
		int a = 10;
		String name = "Deepak";
		
		int square()
		{
			return a*a; 
		}
	%>
	
	<%
	//Scriptlet Tag(Variables, logic, JDBC)
		int b = 20;		
	%>
	
	<%=	name %>
	<%= square()%>
</body>
</html>