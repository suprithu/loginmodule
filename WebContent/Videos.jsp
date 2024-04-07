<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//for HTTP 1.1
	
	response.setHeader("Pragma", "no-cache");//for HTTP older versions
			
	response.setHeader("Expires", "0");//for Proxy Setvers
		
		if(session.getAttribute("username") == null)
		{
			response.sendRedirect("Login.jsp");
		}
		
	%>
	Inside Videos
</body>
</html>