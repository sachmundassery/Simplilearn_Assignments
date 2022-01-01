<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.io.*,java.util.*,java.sql.*, com.mysql.jdbc.Driver"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sql Tags Demo</title>
</head>
<body>


<!-- sql:setDataSource tag -->
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
 
<%--  <!-- sql:update tag to INSERT -->    
<sql:update dataSource="${db}" var="count">    
INSERT INTO emp VALUES (150,'Ramesh', 44000);   
</sql:update> 
<sql:update dataSource="${db}" var="count">    
INSERT INTO emp VALUES (151,'Sumesh', 24000);   
</sql:update> 
<sql:update dataSource="${db}" var="count">    
INSERT INTO emp VALUES (152,'Dinesh', 34000);   
</sql:update> 
<sql:update dataSource="${db}" var="count">    
INSERT INTO emp VALUES (153,'Bijesh', 54000);   
</sql:update> 
 <!-- sql:update tag to INSERT -->    
<sql:update dataSource="${db}" var="count">    
INSERT INTO emp VALUES (154,'Moonjesh', 14000);   
</sql:update>   --%>



<%-- <!-- sql:update with sq:param tag to Update -->  
<c:set var="salary" value="20000"/>  
	<sql:update dataSource="${db}" var="count">  
		Update emp set empname='Manager' WHERE salary> ?  
	 <sql:param value="${salary}" />  
</sql:update>
 --%>

<!-- sql:update with sq:param tag to DELETE -->  
<c:set var="empid1" value="102"/>
<c:set var="empid2" value="103"/>  
	<sql:update dataSource="${db}" var="count">  
		DELETE FROM emp WHERE empid in (?,?);
	 <sql:param value="${empid1}" />
	 <sql:param value="${empid2}" />
</sql:update>
  
 <!-- sql:query  tag --> 
<sql:query dataSource="${db}" var="rs">  
	SELECT * from emp where empid between 101 and 104;  
</sql:query>  

<%-- <!-- sql:query  tag --> 
<sql:query dataSource="${db}" var="rs">  
	SELECT * from emp where empid ;  
</sql:query>   --%>
   
   
<table border="2" width="100%">  
<tr>  
<th>Employee ID</th>  
<th>Employee Name</th>  
<th>Salary</th>  
 
</tr>  
	<c:forEach var="table" items="${rs.rows}">  
		<tr>  
			<td><c:out value="${table.empid}"/></td>  
			<td><c:out value="${table.empname}"/></td>  
			<td><c:out value="${table.salary}"/></td>  
			
		</tr>  
	</c:forEach>  
</table>  
</body>
</html>