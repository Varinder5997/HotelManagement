
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<title>Spring Boot</title>

<style>
table {
	border-collapse: collapse;
}
</style>
</head>
<body>

	<%@page import="java.util.ArrayList"%>
	<%@page import="com.mindtree.bohorooms.entity.LivingFacility"%>
	<%@page import="java.util.Iterator"%>
	<%
		ArrayList<LivingFacility> listUniversities = (ArrayList) request.getAttribute("allFacility");
	%>

	<div align="center">
		<h1>Owner Of BOHORooms</h1>
		<a href="/register_Facility">Add New LivingFacility</a> <br />
		<br />
		<table border="1" cellpadding="10">
			<thead>
				<tr>
					<th>Facility ID</th>
					<th>Facility Name</th>
					<th>Revenue</th>
					<th>Check Rooms</th>
					<th>Check Rating</th>
				</tr>
			</thead>
			<tbody>
				<%
					Iterator<LivingFacility> iterator = listUniversities.iterator();

					while (iterator.hasNext()) {
						LivingFacility livingFacility = iterator.next();
				%>
				<tr>
					<td><%=livingFacility.getFacilityId()%></td>
					<td><%=livingFacility.getFacilityName()%></td>
					<td><%=livingFacility.getRevenue()%></td>
					<td><a
						href="/showRooms/<%=livingFacility.getFacilityId()%>  ">Show
							Rooms</a></td>
					<td><a
						href="/checkRating/<%=livingFacility.getFacilityId()%>  ">Show
							Rating</a></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
		<a
						href="/">Go to Home</a>
	</div>
</body>
</html>

