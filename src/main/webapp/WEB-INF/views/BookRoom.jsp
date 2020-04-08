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
		List<LivingFacility> allLivingFacility=(List<LivingFacility>)request.getAttribute("allLivingFacility");
		//System.out.println("code at this point");
	%>
	
	<div align="center">
		<h1>Select Hotel</h1>

		<form action="/chooseRoom">
			<label for="chooseLivingFacility">Choose a Hotel:</label> <select id="chooseLivingFacility" name="chooseLivingFacility">
				<%
					Iterator<LivingFacility> iterator = allLivingFacility.iterator();

					while (iterator.hasNext()) {
						LivingFacility livingFacility = iterator.next();
				%>

				<option value="<%=livingFacility.getFacilityName()%>"><%=livingFacility.getFacilityName()%></option>

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