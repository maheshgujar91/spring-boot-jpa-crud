<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<p>${message}</p>
<h1>Login Here</h1>
<form action="log">
Enter Username:<input type="text" name="username"><br>
Enter Password:<input type="text" name="password"><br>
<input type="submit" value="Login">
<a href="reg"><br>
Click Here to Register...!!!</a>
</form>
</body>
</html>