<%/*imported below by crt and space*/ %>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div style="border: solid black">
	Please login like a boss
		<form action="/login" method="post">
			<p>
				<font color="red"> ${errorMessage}</font>
			</p>
			Name:<input type="text" name="jname" /> Password: <input
				type="password" name="jpassword" /> <input type="submit"
				value="Login" />
		</form>
	</div>

</body>
</html>