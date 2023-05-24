<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style>
.btn {
	width: 150px;
	height: 150px;
	text-decoration: none;
	cursor: pointer;
	border: 1px solid #1f1b1b !important;
	background: transparent;
	transition: 0.8s !important;
}

.btn:hover {
	background-color: blue;
}
</style>
<title>Insert title here</title>
<%@include file="../includes/head.jsp"%>
</head>
<body>

	<div
		class="container min-vh-100 d-flex justify-content-center align-items-center">
		<div class="row">
			<div class="col">
				<a type="button" class="btn text-center" href="Users.jsp">Users</a>
			</div>
			<div class="col">
				<a type="button" class="btn text-center" href="#">Products</a>
			</div>
			<div class="col">
				<a type="button" class="btn text-center" href="#">Orders</a>
			</div>

		</div>
		



	</div>

</body>
</html>