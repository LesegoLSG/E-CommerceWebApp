package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import products.cart.Cart;

/**
 * Servlet implementation class CartQuantityModify
 */
@WebServlet("/CartQuantityModify")
public class CartQuantityModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter();){
			//Getting an action and id from URL
			String ourAction = request.getParameter("action");
			int id = Integer.parseInt(request.getParameter("id"));
			
			//Getting the session cart_list created from AddToCart servlet
			ArrayList<Cart> cart_listQuantity = (ArrayList<Cart>) request.getSession().getAttribute("cart-list");
			//Ensuring that action is not null and id > 1 for the following code to compile(id from URL)
			if(ourAction != null && id>=1) {
				//Increment button functionality
				if(ourAction.equals("increment")) {
					for(Cart c : cart_listQuantity) {
						if(c.getId()== id) {
							int quantity = c.getQuantity();
							quantity++;
							c.setQuantity(quantity);
							response.sendRedirect("Cart.jsp");
						}
					}
				}
				//Decrement button functionality
				if(ourAction.equals("decrement")) {
					for(Cart c : cart_listQuantity) {
						if(c.getId()== id && c.getQuantity()>1) {
							int quantity = c.getQuantity();
							quantity--;
							c.setQuantity(quantity);
							break;
						}
					}
					response.sendRedirect("Cart.jsp");
				}
			}else {
				response.sendRedirect("Cart.jsp");
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
