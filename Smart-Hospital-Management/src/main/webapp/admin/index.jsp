<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@include file="navbar.jsp" %>
<%@include file="../component/allcss.jsp"%>

</head>
<body>
   <c:if test="${empty adminObj}">
      <c:redirect url="../admin_login.jsp"></c:redirect>
   </c:if>t

  <h1> Admin DashBoard</h1>

</body>
</html>