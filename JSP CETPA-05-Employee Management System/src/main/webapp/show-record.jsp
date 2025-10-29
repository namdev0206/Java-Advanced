<%@page import="java.sql.*" %>

<html>
	<body onload="makeActive('search')">
	<%
		String eid = request.getParameter("eid");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp10", "root", "Nik@2001");
		PreparedStatement ps = cn.prepareStatement("select * from employeeinfo where eid=?");
		ps.setString(1, eid);
		ResultSet rst= ps.executeQuery();
		
		if(rst.next())
		{
	%>
		<%@ include file="navbar.jsp" %>
		<div class="col-5 mx-auto my-3">
			<div class="card">
				<div class="card-body">
					<div class="table">
						<table class="table table-bordered">
						
							<tr>
								<th colspan="2" style="text-align:center; background-color:blue; color:white">
									<label>Employee Details</label>
								</th>
							</tr>
						
							<tr>
								<th>Employee ID</th>
								<td><%=eid%></td>
							</tr>
							
							<tr>
								<th>First Name</th>
								<td><%=rst.getString(2)%></td>
							</tr>
							
							<tr>
								<th>Last Name</th>
								<td><%=rst.getString(3)%></td>
							</tr>
							
							<tr>
								<th>Phone Number</th>
								<td><%=rst.getString(4)%></td>
							</tr>
							
							<tr>
								<th>Email ID</th>
								<td><%=rst.getString(5)%></td>
							</tr>
							
							<tr>
								<th>Department</th>
								<td><%=rst.getString(6)%></td>
							</tr>
							
							<tr>
								<th>Salary</th>
								<td>&#8377;<%=rst.getInt(7)%></td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
		<% 
		}
		else
		{
			%>
				<jsp:include page="search.jsp"/>
				<div class="dvv">
					<span>Employee with ID <%=eid %> not found..</span>
				</div>
			<%
		}
		%>