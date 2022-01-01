<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.util.List,java.util.ArrayList,java.util.Collections" %>
	<%
		List<String> pNames = new ArrayList<String>(Collections.list(request.getParameterNames()));
		for (String n : pNames) {
			out.println(n + ": " + request.getParameter(n) + "<br/>");
		}
	%>
	<%!
		int l = 50;
		int b = 2;
	%>
	<%=
		"Area of rectange with l = " + l + " and b = " + b + " is " + (l*b)
	%>

</body>
</html>