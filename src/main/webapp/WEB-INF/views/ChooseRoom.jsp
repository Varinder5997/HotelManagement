<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.List"%>
	<%@page import="com.mindtree.bohorooms.entity.Rooms"%>
	<%@page import="com.mindtree.bohorooms.entity.User"%>
	<%@page import="com.mindtree.bohorooms.entity.LivingFacility"%>
	<%@page import="com.mindtree.bohorooms.dto.UserAndFacilityDto"%>
	<%@page import="java.util.Iterator"%>
	<%
		List<Rooms> allRooms=(List<Rooms>)request.getAttribute("freerooms");
		//System.out.println("code at this point");
	%>
	
	<div align="center">
		<h1>Select Hotel</h1>

		<form action="/selectedRoom">
			<label for="chooseroomId">Choose a Hotel:</label> <select id="chooseroomId" name="chooseroomId">
				<%
					Iterator<Rooms> iterator = allRooms.iterator();

					while (iterator.hasNext()) {
						Rooms rooms = iterator.next();
				%>

				<option value="<%=rooms.getRoomId()%>"><%=rooms.getRoomId()%></option>

				<%
					}
				%>
			</select> <br>
			<br>

			<button type="submit">Done</button>


		</form>

		<br>
		<br>
		<br>

	</div>

</body>
</html>