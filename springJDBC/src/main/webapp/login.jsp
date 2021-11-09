<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<h3>Spring MVC user registration and login example using JdbcTemplate</h3>
	<h3>Login Page</h3>
	<form action="login" method="post">
		UserName:<input type="text" name="username"><br>
		Password:<input type="password" name="password"><br> 
		<input	type="submit" value="Login">
		<h3><a href="registration.jsp">Register</a></h3>
	</form>
	${msg}
</body>
</html>