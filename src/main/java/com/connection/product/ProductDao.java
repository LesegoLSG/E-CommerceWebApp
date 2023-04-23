package com.connection.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import products.product.IProduct;
import products.product.ProductBuilder;

public class ProductDao {
	
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String query;
	
	public ProductDao(Connection connection) {
		super();
		this.connection = connection;
	}
	
	public List<IProduct> getAllProducts(){
		List<IProduct> allproducts = new ArrayList<IProduct>();
		
		try {
			query = "select * from product";
			preparedStatement = this.connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				IProduct product = new ProductBuilder().setId(resultSet.getInt("id"))
										.setName(resultSet.getString("name"))
										.setCategory(resultSet.getString("category"))
										.setPrice(resultSet.getFloat("price"))
										.setImage(resultSet.getString("image"))
										.getProduct();
				
				allproducts.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return allproducts;
	}
	
	
}
