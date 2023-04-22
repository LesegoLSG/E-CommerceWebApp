package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.DBConnection;
import com.connection.user.UserDao;

import userdetails.user.IUser;
import userdetails.user.UserBuilder;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Getting user inputs
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String mobile = request.getParameter("mobile");
		String dateofbirth = request.getParameter("dateofbirth");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		//set user attributes
		IUser newUser = new UserBuilder().setFirstname(firstname).setLastname(lastname).setGender(gender).setMobilenum(mobile)
						.setDOB(dateofbirth).setAddress(address).setEmail(email).setPassword(password).getUser();
		
		try {
			//Connecting database to the program
			UserDao userdao = new UserDao(DBConnection.getConnection());
			//registering user
			 userdao.RegistrationValidation(newUser);
			
			 response.sendRedirect("Login.jsp");
			
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
	}

}
