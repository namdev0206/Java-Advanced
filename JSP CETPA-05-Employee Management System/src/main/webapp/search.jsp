<%@ include file="navbar.jsp" %>

<html>
	<body onload="makeActive('search')">
		<div class="dv">
  			<form action="show-record.jsp">
  				<input class="tts" type="text" name="eid" placeholder="Employee Id" required>
  				<button class="bt">Search</button>
  			</form>
		</div>
	</body>
</html>