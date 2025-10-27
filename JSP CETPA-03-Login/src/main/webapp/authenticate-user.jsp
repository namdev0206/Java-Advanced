<html>
	<head>
		<title>CETPA Infotech</title>
	</head>
	
	<body>
		<%
			String name = request.getParameter("username");
			String pass = request.getParameter("password");
			
			if(name.equals("admin") && pass.equals("cetpa"))
			{
				response.sendRedirect("home.jsp");
			}
			else
			{
				%>
					<jsp:include page="login.jsp"/>
					
					<div style="text-align: center">
						<h3 style="color: red">Username or Password is incorrect</h3>
					</div>
				<%
			}
		%>
	</body>
</html>