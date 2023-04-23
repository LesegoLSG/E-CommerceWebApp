package products.product;

/**
 * 
 * @author Mhlongo L
 * 
 * Interface for product class
 *
 */
public interface IProduct {
	
	public int getId();
	public void setId(int id);
	public String getName();
	public void setName(String name);
	public String getCategory();
	public void setCategory(String category);
	public String getPrice();
	public void setPrice(String price);
	public String getImage();
	public void setImage(String image);

}
