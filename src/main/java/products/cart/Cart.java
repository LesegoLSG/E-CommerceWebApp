package products.cart;

import products.product.Product;

public class Cart extends Product{
	
	private int quantity;
	
	public Cart(int id, String name, String category, float price, String image) {
		super(id, name, category, price, image);
		// TODO Auto-generated constructor stub
	}

	

	public Cart() {
		super();
	}



	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



}
