<%@ include file="navbar.jsp" %>

<html>
	<body onload="makeActive('delete')">
		<div class="dv">
  			<form action="confirm-delete.jsp">
  				<input class="tts" type="text" name="eid" placeholder="Employee Id" required>
  				<button class="bt" style="background:red; color:white">Delete</button>
  			</form>
		</div>
	</body>
</html>