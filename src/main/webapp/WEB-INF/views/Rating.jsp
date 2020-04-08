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
<%-- 	<%@page import="java.util.List"%>
	<%@page import="com.mindtree.bohorooms.entity.Rooms"%>
	<%@page import="com.mindtree.bohorooms.entity.User"%>
	<%@page import="com.mindtree.bohorooms.entity.LivingFacility"%>
	<%@page import="com.mindtree.bohorooms.dto.UserAndFacilityDto"%>
	<%@page import="java.util.Iterator"%>
	<%
	UserAndFacilityDto dto = (UserAndFacilityDto) request.getAttribute("dto");
		User user  =dto.getUser();
		List<LivingFacility> allLivingFacility=dto.;
	System.out.println("code at this point");
	%> --%>
	<%-- 
<%@page import ="com.mindtree.kalingahospital.entity.KalingaHospital" %> --%>
	<div align="center">
		<h1>Give Rating to Living Facility</h1>
		<br />
		<form:form action="/facility-rating" method="POST" modelAttribute="ratingDto">

			<table border="0" cellpadding="10">
				<tr>
					<td>Rating:</td>
					<td><form:input path="rating" /></td>
	
				</tr>
				<tr>
					<td colspan="2"><button type="submit">Save</button></td>
				</tr>			

			</table>
		</form:form>
	</div>
</body>
</html>