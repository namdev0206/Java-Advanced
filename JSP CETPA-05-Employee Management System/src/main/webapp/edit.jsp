<%@ include file="navbar.jsp" %>

<html>
	<body onload="makeActive('edit')">
		<div class="dv">
  			<form action="edit-record.jsp">
  				<input class="tts" type="text" name="eid" placeholder="Employee Id" required>
  				<button class="bt" style="background:green">Show Record</button>
  			</form>
		</div>
	</body>
</html>