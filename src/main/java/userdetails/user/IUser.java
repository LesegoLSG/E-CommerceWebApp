package userdetails.user;

public interface IUser {
	
	public int getId();
	public String getFirstname();
	public String getLastname();
	public String getGender();
	public String getEmail();
	public String getPassword();
	public String getMobilenum();
	
	public void setId(int id);
	public void setFirstname(String firstname);
	public void setLastname(String lastname);
	public void setGender(String gender);
	public void setEmail(String email);
	public void setPassword(String password);
	public void setMobilenum(String mobilenum);
	
	public String toString();
}
