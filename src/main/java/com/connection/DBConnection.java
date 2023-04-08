package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection connection = null;
	static String url = "jdbc:mysql://localhost:3306/twiceinchdb";
	static String uname = "root";
	static String pass = "lesegoLSGTSI2#";
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		System.out.println("Connected 0");
	
	if(connection == null) {
		System.out.println("Connected 1");
	Class.forName("com.mysql.cj.jdbc.Driver");
	connection = DriverManager.getConnection(url, uname, pass);
	System.out.println("Connected");
	}
	return connection;
	}
}
