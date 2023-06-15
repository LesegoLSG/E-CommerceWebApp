package com.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connection.DBConnection;
import com.connection.user.UserDao;

import userdetails.user.ICustomer;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/User-Servlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html,charset=UTF-8");
		
		try (PrintWriter out = response.getWriter()){
			//Getting login info from user
			String email = request.getParameter("login-email");
			String password = request.getParameter("login-password");
			
			try {
				UserDao userdao = new UserDao(DBConnection.getConnection());
				ICustomer user = userdao.LoginValidation(email, password);
				
				if(user != null) {
					//set session
					HttpSession session = request.getSession();
					session.setAttribute("auth", user);
					//Redirect to index.jsp
					response.sendRedirect("index.jsp");
				}else {
					//Redirect to Login.jsp
					response.sendRedirect("Login.jsp");
				}
			}catch(Throwable e) {
				e.printStackTrace();
			}
		}
		
		//response.sendRedirect("index.jsp");
	}

}
