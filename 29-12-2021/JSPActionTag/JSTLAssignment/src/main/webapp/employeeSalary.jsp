<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<c:set var="emp1" value="20000" />	
	Salary of Employee1 : <c:out value="${emp1}"/>
	<br>
	<c:set var="emp2" value="14000"/>
	Salary of Employee2 : <c:out value="${emp2}"/>
	<br>	
	<c:set var="emp3" value="25000"/>
	Salary of Employee3 : <c:out value="${emp3}"/>
	<br>	
	<c:set var="emp4" value="10000"/>
	Salary of Employee4 : <c:out value="${emp4}"/>
	<br>
	<br>
	
	<c:forEach var="emp" items="${emp1},${emp2},${emp3},${emp4}">
		<c:choose>
			<c:when test="${emp le 13000}">
				<c:out value="Add 5000 to ${emp} = " />
				<c:out value="${emp + 5000}"/>
				<br/>
			</c:when>
			<c:when test="${emp >= 13500 && emp <= 21000}">
				<c:out value="Add 7000 to ${emp} = " />
				<c:out value="${emp + 7000}"/>
				<br/>
			</c:when>
			<c:when test="${emp} >= 22000 && ${emp} <= 26000">
				<c:out value="Add 9000 to ${emp} = " />
				<c:out value="${emp + 9000}"/>
				<br/>
			</c:when>
			<c:when test="${emp} >= 28000">
				<c:out value="Add 10000 to ${emp} = " />
				<c:out value="${emp + 10000}"/>
				<br/>
			</c:when>
		</c:choose>
	</c:forEach>
		
	<c:remove var="emp1"/>
	<c:remove var="emp2"/>
	<c:remove var="emp3"/>
	<c:remove var="emp4"/>
	
</body>
</html>