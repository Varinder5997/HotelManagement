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
	<%-- 
<%@page import ="com.mindtree.kalingahospital.entity.KalingaHospital" %> --%>
	<div align="center">
		<h1>Add New Room</h1>
		<br />
		<form:form action="/save-room" method="POST" modelAttribute="room">

			<table border="0" cellpadding="10">
				<tr>
					<td>Type of room:</td>
					<td><form:input path="type" /></td>

				</tr>
				<tr>
					<td>Price of room:</td>
					<td><form:input path="price" /></td>

				</tr>
					<tr>
					<td>Avalability of Room:</td>
					<td><form:input path="available" /></td>

				</tr>

				<tr>
					<td colspan="2"><button type="submit">Save</button></td>
				</tr>

			</table>
		</form:form>
	</div>
</body>
</html>