<%@page import="java.sql.*" %>
<html>
	<head>
		<title>CETPA Infotech</title>
	</head>
	
	<body>
		<%
			String name = request.getParameter("username");
			String pass = request.getParameter("password");
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp10", "root", "Nik@2001");
				PreparedStatement ps = cn.prepareStatement("select * from userifo where username=? and password=?");
				
				ps.setString(1, name);
				ps.setString(2, pass);
				
				ResultSet rst= ps.executeQuery();
				
				if(rst.next())
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

			}
			catch(Exception ex)
			{
				out.println(ex);
			}
		%>
	</body>
</html>