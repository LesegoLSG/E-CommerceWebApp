<%@page import="products.cart.*"%>
<%@page import="java.util.*"%>
<!-- Cart Session -->
	<% 
	ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
	if(cart_list != null){
		
		request.setAttribute("cart_list",cart_list);
	}
	%>