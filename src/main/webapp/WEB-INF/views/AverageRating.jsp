<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
float averageRating = (float) request.getAttribute("rating");

%>
<h1>Average Rating of this facility is =<%=averageRating %></h1>

<a href="/owner">Go to Home</a>
</body>
</html>