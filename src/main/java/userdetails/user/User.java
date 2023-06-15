package userdetails.user;




public class User implements ICustomer{
	//Attributes
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
	
	

	
	//Augument less constructor
	public User() {
		super();
	}
	//Constructor with fields
	public User(int id, String firstname, String lastname, String gender, String email, String password,
			 String mobilenum,String DOB,String address,String role,String registrationDate) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.mobilenum = mobilenum;
		this.DOB = DOB;
		this.address = address;
		this.role = role;
		this.registrationDate = registrationDate;
	}
	
	//Getters
	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getMobilenum() {
		return mobilenum;
	}
	
	public String getDOB() {
		return DOB;
	}

	public String getAddress() {
		return address;
	}
	
	
	//Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", email=" + email + ", password=" + password + ", mobilenum=" + mobilenum + "]";
	}

	
	
	
	
	

}
