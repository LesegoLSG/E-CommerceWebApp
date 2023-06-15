package com.connection.user;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import userdetails.user.ICustomer;
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
	
	public ICustomer LoginValidation(String email, String password) {
		ICustomer user = null;
		try {
			query = "select * from customer where email=? and password=?";
			preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				user = new UserBuilder().setId(resultSet.getInt("id")).setFirstname("firstname").setLastname("lastname")
												.setEmail("email").setPassword("password").setMobilenum("mobilenum")
												.setDOB("dateofbirth").setAddress("address").getUser();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print("Went wrong");
		}
		return user;
	}
	
	public void RegistrationValidation(ICustomer user) {
		query = "INSERT into customer(firstname,lastname,gender,password,dateofbirth,address,email,mobilenum) values (?,?,?,?,?,?,?,?)";
		
		
		try {
			preparedStatement = this.connection.prepareStatement(query);
			//preparedStatement.setInt(1,1);
			preparedStatement.setString(1, user.getFirstname());
			preparedStatement.setString(2, user.getLastname());
			preparedStatement.setString(3, user.getGender());
			preparedStatement.setString(4, user.getMobilenum());
			preparedStatement.setString(5, user.getDOB());
			preparedStatement.setString(6, user.getAddress());
			preparedStatement.setString(7, user.getEmail());
			preparedStatement.setString(8, user.getPassword());
			
			System.out.println("PreparedStatement: " + preparedStatement);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
