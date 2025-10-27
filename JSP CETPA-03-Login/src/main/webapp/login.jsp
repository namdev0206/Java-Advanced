<html>
	<head>
		<title>LOGIN PAGE</title>
		<link rel="stylesheet" href="CSS/login.css">
	</head>
	
<body>
	<form action="authenticate-user.jsp" method="post">
		<table class="ta">
			<tr>
				<td>Enter user name</td>
				<td>
					<input type="text" name="username" class="tb" required></input>
				</td>
			</tr>
			
			<tr>
				<td>Enter password</td>
				<td>
					<input type="password" name="password" class="tb" required></input>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="right">
					<button class="bt">Submit</button>
					<input type="button" class="bt" style="background-color: red" value="Cancel">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>