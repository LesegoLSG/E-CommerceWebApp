package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import products.cart.Cart;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html,charset=UTF-8");
		
		try(PrintWriter printout = response.getWriter()){
			//ArrayList which holds cart data.
			ArrayList<Cart> listcart = new ArrayList<>(); 
			
			//getting a product id using session
			int id = Integer.parseInt(request.getParameter("id")); 
			Cart cart = new Cart();
			cart.setId(id);
			cart.setQuantity(1);
			
			
			HttpSession session = request.getSession();
			ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
			
			if(cart_list == null) {
				listcart.add(cart);
				session.setAttribute("cart-list", listcart);
				response.sendRedirect("index.jsp");
			}else {
				//printout.println("Cart list already exists");
				listcart = cart_list;
				boolean productexist = false;
				
				for(Cart c:listcart) {
					//checks if the product id from session is equal to the one given by URL Parameters
					if(c.getId() == id) {
						productexist = true;
						printout.println("<h3 style='color:crimson;text-align:center'>Item already exists.<a href='Cart.jsp'>Go to cart page</a></h3>");
					}
				}
				if(!productexist) {
					listcart.add(cart);
					response.sendRedirect("index.jsp");
				}
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
