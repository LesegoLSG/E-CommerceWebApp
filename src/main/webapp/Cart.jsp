<%@page import="userdetails.user.*"%>
<%@page import="com.connection.product.*"%>
<%@page import="com.connection.*"%>
<%@page import="products.cart.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<!-- Getting session from addToCart servlet -->
	<% 
	ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
	List<Cart> cartProduct = null;
	if(cart_list != null){
		ProductDao productdao = new ProductDao(DBConnection.getConnection());
		cartProduct = productdao.addProductToCart(cart_list);
		//my code
		float totalSum = productdao.totalItemPrice(cart_list);
		request.setAttribute("cart_list",cart_list);
		request.setAttribute("totalSum",totalSum);
	}
	%>

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
			<!-- if there is no item in the cart totalSum=0, else totalSum= total of item(s) -->
			<h3>Total Price:R ${(totalSum>0)?totalSum:0.00}</h3>
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
			<%
			if(cart_list != null){
				//session cart_list can be used instead of arraylist "cartProduct".
				for(Cart cart:cartProduct){%>
					<tr>
					<td><%=cart.getName() %></td>
					<td><%=cart.getCategory() %></td>
					<td><%=cart.getPrice() %></td>

					<td>
						<form action="" method="post" class="form-inline">
							<input type="hidden" name="id" value="<%=cart.getId() %>" class="form-input">
							<div class="form-group d-flex justify-content-between">
								<a class="btn btn-sm btn-decre" href="#"><i
									class="fas fa-minus-circle"></i></a>
									<input type="text" name="quantity" class="form-control" value="1" readonly>
								<a class="btn btn-sm btn-incre" href="#"><i
									class="fas fa-plus-circle"></i></a> 
							</div>

						</form>
					</td>
					<td><a class="btn btn-sm btn-danger" href="#">Remove from list</a></td>
				</tr>
				<% 
				}
			}
			%>
				

			</tbody>
		</table>
	</div>

	<%@include file="includes/footer.jsp"%>
</body>
</html>