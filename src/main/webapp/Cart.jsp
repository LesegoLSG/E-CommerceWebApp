<%@page import="userdetails.user.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<title>Cart</title>
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
	<!-- Checks if session is null and redirect -->
	<%@include file="includes/LoginSession.jsp"%>

	<div class="container">
		<div class="d-flex py-3">
			<h3>Total Price: R562.00</h3>
			<a class="mx-3 btn btn-primary" href="#">Check out</a>
		</div>

		<table class="table table-light">
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Category</th>
					<th scope="col">Price</th>
					<th scope="col">Buy Now</th>
					<th scope="col">Cancel</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Women shoes</td>
					<td>shoes</td>
					<td>R450.00</td>

					<td>
						<form action="" method="post" class="form-inline">
							<input type="hidden" name="id" value="1" class="form-input">
							<div class="form-group d-flex justify-content-between">
								<a class="btn btn-sm btn-incre" href="#"><i
									class="fas fa-plus-circle"></i></a> <input type="text"
									name="quantity" class="form-control" value="1" readonly>
								<a class="btn btn-sm btn-decre" href="#"><i
									class="fas fa-minus-circle"></i></a>
							</div>

						</form>
					</td>
				</tr>

			</tbody>
		</table>
	</div>

	<%@include file="includes/footer.jsp"%>
</body>
</html>