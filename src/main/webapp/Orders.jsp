<%@page import="userdetails.user.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <!-- Getting session since its used in our navbar -->
    
<!DOCTYPE html>
<html>
<head>

<title>Order</title>
<%@include file="includes/head.jsp" %>

</head>
<body>

<%
	//Cache to prevent back button.
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
	response.setHeader("Pragma", "no-cache"); //HTTP 1.0
	response.setHeader("Expires", "0"); //Proxies

	
	%>
	
<%@include file="includes/navbar.jsp" %>

	
<h1>Orders</h1>
<!-- Checks if session is null and redirect -->
<%@include file="includes/LoginSession.jsp" %>

<%@include file="includes/footer.jsp" %>
</body>
</html>