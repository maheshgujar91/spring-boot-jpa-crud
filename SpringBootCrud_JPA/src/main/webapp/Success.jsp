<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cjc.spring_pro.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<script type="text/javascript">
function deletedata() {
	document.myform.action=("delete");
	document.myform.submit();
}
function adddata() {
	document.myform.action=("reg");
	document.myform.submit();
}
function updatedata() {
	document.myform.action=("edit");
	document.myform.submit();
}
</script>
</head>
<body>

<h1 align="center">Student Information</h1>
<form name="myform">
<table border="1">
<tr>
<th>SELECT</th>
<th>STUDENT ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>MOBILE NO</th>
<th>EMAIL-ID</th>
<th>USERNAME</th>
<th>PASSWORD</th>
</tr>
<tr>

<tr>
<% 
   List<Student> list =(List) request.getAttribute("sdata");
   for(Student s: list)
   {%>
   <td align="center"><input type="radio" name="id" value="<%=s.getId()%>"></td>
   <td align="center"><%=s.getId() %></td>
   <td align="center"><%=s.getName() %></td>
   <td align="center"><%=s.getAddress() %></td>
   <td align="center"><%=s.getMobile() %></td>
   <td align="center"><%=s.getEmail() %></td>
   <td align="center"><%=s.getUsername() %></td>
   <td align="center"><%=s.getPassword() %></td>
   <tr>
   <%}
%>
</tr>
<tr>
<td align="center"><input type="button" value="DELETE" onclick="deletedata()"></td>
<td align="center"><input type="button" value="ADD" onclick="adddata()"></td>
<td align="center"><input type="button" value="UPDATE" onclick="updatedata()"></td>
</tr>
</table>
</form>
<a href="Login.jsp"><input type="submit" value="Logout"></a>

</body>
</html>