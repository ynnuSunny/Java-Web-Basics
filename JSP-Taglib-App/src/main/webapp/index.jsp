<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<%@page isELIgnored="false" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="name" value="Hello World"></c:set>
<c:out value="${name}"></c:out>

<c:if test="${3<5}">
    <h1>Yes it is True</h1>
</c:if>



</body>
</html>