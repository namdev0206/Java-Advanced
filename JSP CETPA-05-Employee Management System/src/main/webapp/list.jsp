<%@page import="java.sql.*" %>
<%@ include file="navbar.jsp" %>

<html>
	<body onload="makeActive('list')">
		<div class="col-10 mx-auto my-3">
			<div class="card">
				<div class="card-body">
					<div class="table">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Employee ID</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Phone Number</th>
									<th>Email ID</th>
									<th>Department</th>
									<th>Salary</th>
								</tr>
							</thead>
							
							<tbody>
								<%
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp10", "root", "Nik@2001");
								Statement st= cn.createStatement();
								ResultSet rst = st.executeQuery("select * from employeeinfo");
								
								while(rst.next())
								{
									%>
										<tr>
											<td><%= rst.getString(1) %></td>
											<td><%= rst.getString(2) %></td>
											<td><%= rst.getString(3) %></td>
											<td><%= rst.getString(4) %></td>
											<td><%= rst.getString(5) %></td>
											<td><%= rst.getString(6) %></td>
											<td>&#8377;<%= rst.getString(7) %></td>
										</tr>	
									<%
								}
								%>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>