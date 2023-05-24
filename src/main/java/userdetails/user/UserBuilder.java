package userdetails.user;

public class UserBuilder {
	
	private int id;
	private String firstname;
	private String lastname;
	private String gender;
	private String email;
	private String password;
	private String mobilenum;
	private String DOB;
	private String address;
	private String role;
	private String registrationDate;
	
	public UserBuilder setId(int id) {
		this.id = id;
		return this;
	}

	
	public UserBuilder setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}
	public UserBuilder setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}
	public UserBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public UserBuilder setEmail(String email) {
		this.email = email;
		return this;
	}
	public UserBuilder setPassword(String password) {
		this.password = password;
		return this;
	}
	
	public UserBuilder setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
		return this;
	}
	
	public UserBuilder setDOB(String dOB) {
		this.DOB = dOB;
		return this;
	}
	
	public UserBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	
	public UserBuilder setRole(String role) {
		this.role = role;
		return this;
	}
	
	public UserBuilder setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
		return this;
	}
	
	
	public User getUser() {
		return new User(id,firstname,lastname,gender,email,mobilenum,password,DOB,address,role,registrationDate);
	}
	
}
