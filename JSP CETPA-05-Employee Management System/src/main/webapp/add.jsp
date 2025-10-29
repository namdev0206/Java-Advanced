<%@ include file="navbar.jsp" %>

<html>
	<body onload="makeActive('add')">
		<div class="col-6 mx-auto my-3">
			<div class="card">
				<div class="card-body">
					<form action="save-record.jsp" method="post">
						<div class="row">
							<div class="col-12">
								<label for="eid">Employee ID</label>
								<input type="text" class="form-control" name="eid" id="eid" required/>
							</div>
						</div>
					
						<div class="row my-3">
							<div class="col-6">
								<label for="firstname">First Name</label>
								<input type="text" class="form-control" name="firstname" id="firstname" required/>
							</div>
						
							<div class="col-6">
								<label for="lastname">Last Name</label>
								<input type="text" class="form-control" name="lastname" id="lastname" required/>
							</div>
						</div>
					
						<div class="row my-3">
							<div class="col-6">
								<label for="phone">Phone Number</label>
								<input type="text" class="form-control" name="phone" id="phone" required/>
							</div>
						
							<div class="col-6">
								<label for="email">Email ID</label>
								<input type="text" class="form-control" name="email" id="email" required/>
							</div>
						</div>
					
						<div class="row my-3">
							<div class="col-6">
								<label for="department">Department</label>
								<input type="text" class="form-control" name="department" id="department" required/>
							</div>
						
							<div class="col-6">
								<label for="salary">Salary</label>
								<input type="text" class="form-control" name="salary" id="salary" required/>
							</div>
						</div>
					
						<div class="row my-3">
							<div class="col-12 text-end">
								<button class="btn btn-primary"> Save Record</button>
								<input type="button" value="Cancel" class="btn btn-secondary">
							</div>
						</div>
					</form>	
				</div>
			</div>
		</div>
	</body>
</html>