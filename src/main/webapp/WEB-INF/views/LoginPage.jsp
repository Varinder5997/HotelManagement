<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="com.mindtree.bohorooms.entity.Rooms"%>
	<%@page import="com.mindtree.bohorooms.entity.User"%>
	<%@page import="com.mindtree.bohorooms.entity.LivingFacility"%>
	<%@page import="com.mindtree.bohorooms.dto.UserAndFacilityDto"%>
	<%@page import="java.util.Iterator"%>
	<%
		User user= (User)request.getAttribute("user");
		//System.out.println("code at this point");
	%>

<h1>Welcome to BOHORooms</h1>
<h3>User Id = <%=user.getId() %></h3>
<h3>User Name = <%=user.getName() %></h3>

			<table border="0" cellpadding="10">
			<tr>
				<td>Living Facility Name:</td>
					<td>Id of room:</td>
					<td>Type of room:</td>
					<td>Price of Room:</td>
					<td>Checkout Room</td>
					
				</tr>
				<%
					Iterator<Rooms> iterator = user.getRooms().iterator();

					while (iterator.hasNext()) {
						Rooms rooms = iterator.next();
				%>
				
				
				<tr>
					<td><%=rooms.getLivingFacility().getFacilityName()%></td>
					<td><%=rooms.getRoomId() %></td>
					<td><%=rooms.getType() %></td>
					<td><%=rooms.getPrice() %></td>
					<td><a href="/ceckout/<%=rooms.getRoomId()%>">Checkout Room</a></td>
				</tr>
				
				<%
					}
				%>

				

			</table>
			<br>
			<a href="/ceckin/<%=user.getId()%>">CheckIn Room</a>
			<br>
			<br>
&nbsp;&nbsp;&nbsp;<a href="/">Log Out</a>

</body>
</html>