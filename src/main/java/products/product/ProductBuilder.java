package products.product;

/**
 * 
 * @author Mhlongo L
 *
 * Class to build a desired product without worrying much about attributes.
 */
public class ProductBuilder {
	
	private int id;
	private String name;
	private String category;
	private float price;
	private String image;
	
	public ProductBuilder setId(int id) {
		this.id = id;
		return this;
	}
	public ProductBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public ProductBuilder setCategory(String category) {
		this.category = category;
		return this;
	}
	public ProductBuilder setPrice(float price) {
		this.price = price;
		return this;
	}
	public ProductBuilder setImage(String image) {
		this.image = image;
		return this;
	}
	
	public Product getProduct() {
		return new Product(id,name,category,price,image);
	}
	
	
}
