package userdetails.user;

public interface ICustomer {
	
	public int getId();
	public String getFirstname();
	public String getLastname();
	public String getGender();
	public String getEmail();
	public String getPassword();
	public String getMobilenum();
	public String getDOB();
	public String getAddress();
	public String getRole();
	public String getRegistrationDate();
	
	public void setId(int id);
	public void setFirstname(String firstname);
	public void setLastname(String lastname);
	public void setGender(String gender);
	public void setEmail(String email);
	public void setPassword(String password);
	public void setMobilenum(String mobilenum);
	public void setDOB(String dOB);
	public void setAddress(String address);
	public void setRole(String role);
	public void setRegistrationDate(String registrationDate);
	
	
	
	public String toString();
}
