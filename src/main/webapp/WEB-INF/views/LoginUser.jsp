<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Add new User</title>
</head>
<body>
	<div align="center">
		<h1>Login User</h1>
		<br />
		<form:form action="/login-user" method="POST" modelAttribute="loginDto">

			<table border="0" cellpadding="10">
				<tr>
					<td>User Id:</td>
					<td><form:input path="id" /></td>

					<td>User Password:</td>
					<td><form:input type ="password" path="password" /></td>

				</tr>
				

				<tr>
					<td colspan="2"><button type="submit">Save</button></td>
				</tr>

			</table>
		</form:form>
	</div>
</body>
</html>