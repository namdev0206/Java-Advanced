<%@ page import="java.sql.*"%>

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

<html>
	<body onload="makeActive('edit')">
		<div class="col-6 mx-auto my-3">
			<div class="card">
				<div class="card-body">
					<form action="update-record.jsp" method="post">
						<div class="row">
							<div class="col-12">
								<label for="eid">Employee ID</label>
								<input type="text" value="<%=eid%>" class="form-control" name="eid" id="eid" required readonly="readonly"/>
							</div>
						</div>
					
						<div class="row my-3">
							<div class="col-6">
								<label for="firstname">Edit First Name</label>
								<input type="text" value="<%=rst.getString(2)%>" class="form-control" name="firstname" id="firstname" required/>
							</div>
						
							<div class="col-6">
								<label for="lastname">Edit Last Name</label>
								<input type="text" value="<%=rst.getString(3)%>" class="form-control" name="lastname" id="lastname" required/>
							</div>
						</div>
					
						<div class="row my-3">
							<div class="col-6">
								<label for="phone">Edit Phone Number</label>
								<input type="text" value="<%=rst.getString(4)%>" class="form-control" name="phone" id="phone" required/>
							</div>
						
							<div class="col-6">
								<label for="email">Edit Email ID</label>
								<input type="text" value="<%=rst.getString(5)%>" class="form-control" name="email" id="email" required/>
							</div>
						</div>
					
						<div class="row my-3">
							<div class="col-6">
								<label for="department">Edit Department</label>
								<input type="text" value="<%=rst.getString(6)%>" class="form-control" name="department" id="department" required/>
							</div>
						
							<div class="col-6">
								<label for="salary">Edit Salary</label>
								<input type="text" value="<%=rst.getInt(7)%>" class="form-control" name="salary" id="salary" required/>
							</div>
						</div>
					
						<div class="row my-3">
							<div class="col-12 text-end">
								<button class="btn btn-primary">Update Record</button>
								<button type="button" class="btn btn-secondary" onclick="history.back()">Cancel</button>
							</div>
						</div>
					</form>	
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
			<jsp:include page="edit.jsp"/>
			<div class="dvv">
			<span>Employee with ID <%=eid %> does not exist</span>
			</div>
		<%
	}
%>