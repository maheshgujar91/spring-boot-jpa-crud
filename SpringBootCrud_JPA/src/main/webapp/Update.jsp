<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
<h1>Update Here</h1>
<form action="update">
<input type="hidden" name="id" value="${sdata.id}"><br>
Enter New Name:<input type="text" name="name" value="${sdata.name}"><br>
Enter New Address:<input type="text" name="address" value="${sdata.address}"><br>
Enter New Mobile No.:<input type="text" name="mobile" value="${sdata.mobile}"><br>
Enter New Email-Id:<input type="text" name="email" value="${sdata.email}"><br>
Enter New Username:<input type="text" name="username" value="${sdata.username}"><br>
Enter New Password:<input type="text" name="password" value="${sdata.password}"><br>
<input type="submit" value="Update">
</form>
</body>
</html>