<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2>Marksheet</h2></center>
<c:set var="Date" value="<%=new java.util.Date()%>" /> 
<h4 align="right">
<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium"  
value="${Date}" />  
</h4>

<c:set var="mark1" value="67" /> 
<p>Marks 1 : <fmt:formatNumber value="${mark1}" type="number" /> / 100</p>

<c:set var="mark2" value="83" /> 
<p>Marks 2 : <fmt:formatNumber value="${mark2}" type="number" /> / 100</p>

<c:set var="mark3" value="76" /> 
<p>Marks 3 : <fmt:formatNumber value="${mark3}" type="number" /> / 100</p>

<c:set var="mark4" value="91" /> 
<p>Marks 4 : <fmt:formatNumber value="${mark4}" type="number" /> / 100</p>

<c:set var="mark5" value="87" /> 
<p>Marks 5 : <fmt:formatNumber value="${mark5}" type="number" /> / 100</p>

<c:set var="Tot_Mark" value="${mark1 + mark2 + mark3 + mark4 + mark5}"/>  
<h4>Total Marks : <fmt:formatNumber value="${Tot_Mark}" type="number" /></h4>

<h3>Percentage : <fmt:formatNumber type="percent"  value="${(Tot_Mark/500)}" /></h3>


<c:set var="sem1" value="13800" /> 
<h5>Fees Paid in Sem 1 : <fmt:formatNumber value="${sem1}" type="currency" /></h5>
<c:set var="sem2" value="21200" /> 
<h5>Fees Paid in Sem 2 : <fmt:formatNumber value="${sem2}" type="currency" /></h5>
<c:set var="sem3" value="32400" /> 
<h5>Fees Paid in Sem 3 : <fmt:formatNumber value="${sem3}" type="currency" /></h5>
<c:set var="sem4" value="42200" /> 
<h5>Fees Paid in Sem 4 : <fmt:formatNumber value="${sem4}" type="currency" /></h5>
<br>

<h4>Total Fees : <fmt:formatNumber value="${sem1+sem2+sem3+sem4}" type="currency" /></h4>
</body>
</html>