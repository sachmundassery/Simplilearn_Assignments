<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- This is JSP ccmments using JSP COmment tag--%>
	<%  
	String name=request.getParameter("username");  
	String age=request.getParameter("age");  
	String email=request.getParameter("email");  
	String city=request.getParameter("city");  
	String gender=request.getParameter("gender");  
	
	
	out.print("Age "+age+"\n");
	out.print("Email "+email+"\n");
	out.print("City "+city+"\n");
	out.print("Gender "+gender+"\n");
	%>  
	<br><br><br>
	
	Expression Tag:::: Current Time: <%= java.util.Calendar.getInstance().getTime() %>  <!-- just like sysout -->
	<%= "\n Welcome "+ request.getParameter("username") %>  
	<br><br><br>
	
	Declaration Tag::: 
	<%! float radius=3.4f; 
	Double area = Math.PI * radius * radius; 

	%>  
    <%= "\n Area of the circle is : "+ area %>  
</body>
</html>