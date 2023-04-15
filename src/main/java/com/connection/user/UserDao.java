package com.connection.user;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import userdetails.user.IUser;
import userdetails.user.User;
import userdetails.user.UserBuilder;
/**
 * 
 * @author Mhlongo L
 * Class to send instruction to and from the database
 *
 */
public class UserDao {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String query;
	
	//Constructor
	public UserDao(Connection connection) {
		this.connection = connection;
	}
	
	public IUser LoginValidation(String email, String password) {
		IUser user = null;
		try {
			query = "select * from user where email=? and password=?";
			preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				user = new UserBuilder().setId(resultSet.getInt("id")).setFirstname("firstname").setLastname("lastname")
												.setEmail("email").setPassword("password").setMobilenum("mobilenum").getUser();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print("Went wrong");
		}
		return user;
	}
	

}
