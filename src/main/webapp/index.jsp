<%@page import="com.connection.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>index</title>
<%@include file="includes/head.jsp" %>

</head>
<body>
<%@include file="includes/navbar.jsp" %>

 <h1>Index page</h1>
 <% out.print(DBConnection.getConnection()); %>

<%@include file="includes/footer.jsp" %>
</body>
</html>