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
 * Servlet implementation class RemoveProductFromCartServlet
 */
@WebServlet("/RemoveProductFromCartServlet")
public class RemoveProductFromCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter printout = response.getWriter()){
			String id = request.getParameter("id");
			
			if(id != null) {
				ArrayList<Cart> cartlistRemove = (ArrayList<Cart>) request.getSession().getAttribute("cart-list");
				if(cartlistRemove != null) {
					for(Cart eachCart: cartlistRemove) {
						if(eachCart.getId() == Integer.parseInt(id)) {
							cartlistRemove.remove(cartlistRemove.indexOf(eachCart));
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
