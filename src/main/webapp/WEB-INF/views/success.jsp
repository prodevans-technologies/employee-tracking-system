<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>${msg}</h1>
<div>
<div align="left">
Welcome<b style="color:red;">${user.E_username}</b>
</div>
<div align="center">
<table>
	<tr>
		<td>Employee id</td>
		<td>${user.E_id}</td>
	</tr>
	<tr>
		<td>User Name</td>
		<td>${user.E_username}</td>
	</tr>
	<tr>
		<td>Password</td>
		<td>${user.E_password}</td>
	</tr>
	<tr>
		<td>Role</td>
		<td>${user.E_role}</td>
	</tr>
</table>
</div>
</div>
</body>
</html>