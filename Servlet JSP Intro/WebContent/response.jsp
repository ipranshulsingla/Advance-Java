<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<% int number=(int)request.getAttribute("number");
	for(int i=1;i<=number;++i){ %>
	<h1>This is heading <%out.print(i);%></h1>
	<%}%>
</body>
</html>