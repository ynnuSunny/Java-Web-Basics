<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@page import="java.util.*" %>   
  <%@page isELIgnored ="false" %><!--  -->
  <!--  -<page errorPage="demp.jsp" %>-><!-- Page e kono error hole demp.jsp te redirect hobe -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  <h1>Hello World</h1>
  <!-- JSP decleation Tag -->
  <%! int a = 10; %>
  <!-- JSP Expression Tag -->
  <%= a %>
  
  <!-- JSP scriptlet Tag -->
  <% int b=10;
     int sum = a+b;
     out.println("SUm of a and b is = "+sum);
  %>
  
  <%@include file="head.jsp" %>
  <br>
  
  <%= new Date().toString() %>

</body>
</html>