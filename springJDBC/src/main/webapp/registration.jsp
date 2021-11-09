<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h3>Spring MVC user registration and login example using JdbcTemplate</h3>
	<h3>Registration Page</h3>
	<form action="register" method="post">
		UserName:<input type="text" name="username"><br>
		Email:<input type="text" name="email"><br>
		Password:<input type="password" name="password"><br>
		<input type="submit" value="Register">
		<h3><a href="login.jsp">Login</a></h3>
	</form>
	${msg}
</body>
</html>