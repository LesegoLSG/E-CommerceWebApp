<%@page import="com.connection.*"%>
<%@page import="userdetails.user.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>

<title>index</title>
<%@include file="includes/head.jsp"%>

</head>
<body>

	<%
	//Cache to prevent back button.
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
	response.setHeader("Pragma", "no-cache"); //HTTP 1.0
	response.setHeader("Expires", "0"); //Proxies
	%>

	<%@include file="includes/navbar.jsp"%>


	

	<!-- Image cards -->
	<div class="container">
		<div class="card-header my-3"> All Products</div>
		<div class="row">
			<div class="col-md-3">
			<div class="card w-100" style="width: 18rem;">
				<img src="..." class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<h6 class="price">R125.00</h6>
					<h6 class="Category">Category: T-Shirt</h6>
					<div class="mt-3 d-flex justify-content-between">
						<a href="#" class="btn btn-primary">Add to cart</a>
						<a href="#" class="btn btn-primary">Buy now</a>
					</div>
					
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Checks if session is null and redirect -->
	<%@include file="includes/LoginSession.jsp"%>

	<%@include file="includes/footer.jsp"%>
</body>
</html>