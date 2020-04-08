
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

	<%@page import="java.util.List"%>
	<%@page import="com.mindtree.bohorooms.entity.Rooms"%>
	<%@page import="com.mindtree.bohorooms.entity.LivingFacility"%>
	<%@page import="com.mindtree.bohorooms.dto.RoomAddDto"%>
	<%@page import="java.util.Iterator"%>
	<%
	RoomAddDto dto = (RoomAddDto) request.getAttribute("roomAddDto");
		List<Rooms> listRooms =dto.getAllRooms();
		LivingFacility livingFacility=dto.getLivingFacility();
	System.out.println("code at this point");
	%>

	<div align="center">
		<h1>Owner Of BOHORooms</h1>
		<a href="/register_Room/<%= livingFacility.getFacilityId()%>">Add New Room</a> <br />
		<br />
		<table border="1" cellpadding="10">
			<thead>
				<tr>
					<th>Room Id</th>
					<th>Type Of Room</th>
					<th>Price</th>
					<th>Avalability</th>
				</tr>
			</thead>
			<tbody>
				<%
					Iterator<Rooms> iterator = listRooms.iterator();

					while (iterator.hasNext()) {
						Rooms rooms = iterator.next();
				%>
				<tr>
					<td><%=rooms.getRoomId()%></td>
					<td><%=rooms.getType()%></td>
					<td><%=rooms.getPrice()%></td>
					<td><%=rooms.isAvailable() %></td>
				<%-- 	<td><a
						href="/deleteRooms/<%=rooms.getRoomId()%>  ">Delete
							Rooms</a></td>
				</tr> --%>
				<%
					}
				%>
			</tbody>
			<a href="/owner">Go to Home</a>
		</table>
	</div>
</body>
</html>

