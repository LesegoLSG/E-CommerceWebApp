package com.connection.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import products.cart.Cart;
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
	
	//Getting all products from the database to the index.jsp to display the product.
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
	
	//adding a product from index.jsp to cart.jsp
	public List<Cart> addProductToCart(ArrayList<Cart> cartlist){
		List<Cart> products = new ArrayList<Cart>();
		try {
			if(cartlist.size()>0) {
				for(Cart item:cartlist) {
					query = "select * from product where id=?";
					preparedStatement = this.connection.prepareStatement(query);
					preparedStatement.setInt(1,item.getId());
					resultSet = preparedStatement.executeQuery();
					while(resultSet.next()) {
						Cart row = new Cart();
						row.setId(resultSet.getInt("id"));
						row.setName(resultSet.getString("name"));
						//row.setImage(resultSet.getString("image"));
						row.setCategory(resultSet.getString("category"));
						row.setQuantity(item.getQuantity());
						row.setPrice(resultSet.getFloat("price") * item.getQuantity());
						products.add(row);
						
					}
				}
			}
			
		}catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		return products;
		
	}
	
	
}
