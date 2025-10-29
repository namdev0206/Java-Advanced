<%@page import="java.sql.*" %>
<%@ include file="navbar.jsp" %>

<html>
	<body onload="makeActive('add')">
		<div class="dv">
		<%
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp10", "root", "Nik@2001");
			PreparedStatement ps = cn.prepareStatement("insert into employeeinfo values(?, ?, ?, ?, ?, ?, ?)");
			
			ps.setString(1, request.getParameter("eid"));
			ps.setString(2, request.getParameter("firstname"));
			ps.setString(3, request.getParameter("lastname"));
			ps.setString(4, request.getParameter("phone"));
			ps.setString(5, request.getParameter("email"));
			ps.setString(6, request.getParameter("department"));
			ps.setString(7, request.getParameter("salary"));
			
			ps.executeUpdate();
		%>
		
			<label class="lam text-success">Employee Record has been Added Successfully</label>
		</div>
	</body>
</html>