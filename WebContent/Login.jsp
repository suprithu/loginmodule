<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="Login" method="post"><!-- here login is a servlet -->
		Enter User name : <input type="text" name="uName"><br>
		Enter Password : <input type="password" name="pass"><br>
		<input type="submit" value="Login">
	</form>
	<form action="Signto.jsp">
		<input type="submit" value="Sign In">
	</form>
</body>
</html>