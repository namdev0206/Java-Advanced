<%@page import="java.sql.*" %>
<%@ include file="navbar.jsp" %>

<html>
	<body onload="makeActive('delete')">
		<div class="dv">
		<%
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp10", "root", "Nik@2001");
			PreparedStatement ps = cn.prepareStatement("delete from employeeinfo where eid=?");
			
			ps.setString(1, request.getParameter("eid"));
		
			ps.executeUpdate();
		%>
		
			<label class="lam text-success">Employee Record has been Deleted Successfully</label>
		</div>
	</body>
</html>