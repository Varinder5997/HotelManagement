<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<title>Add new User</title>
<style type="text/css">
body{
background-image:
url("https://pix6.agoda.net/hotelImages/4974363/-1/a37983417e8da5908c3f7042c45e9fb0.jpg?s=1024x768");
 background-size: auto;
}
table {
	 th, td { 
                width:150px; 
                text-align:center; 
                padding:5px ;
              cellpadding="20"
            }
}

</style>

</head>
<body>

	<div align="right">
		<h1>Add New User</h1>
		<br />
		<form:form action="/save-user" method="POST" modelAttribute="user">

			<table >
			<tr>
					<td>User Id:</td>
					<td><form:input path="id" /></td>

				</tr>
				
				<tr>
					<td>User Name:</td>
					<td><form:input path="name" /></td>

				</tr>
				<tr>
					<td>User age:</td>
					<td><form:input path="age" /></td>

				</tr>
				<tr>
					<td>User Password:</td>
					<td><form:input type ="password" path="password" /></td>

				</tr>
					<tr>
					<td>User Address:</td>
					<td><form:input path="address" /></td>

				</tr>

				<tr>
					<td colspan="2"><button type="submit">Save</button></td>
				</tr>

			</table>
		</form:form>
	</div>
</body>
</html>