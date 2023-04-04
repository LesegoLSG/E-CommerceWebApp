package userdetails.user;

public class UserBuilder {
	
	private int id;
	private String firstname;
	private String lastname;
	private String gender;
	private String email;
	private String password;
	private String identity;
	private String mobilenum;
	
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
	public UserBuilder setIdentity(String identity) {
		this.identity = identity;
		return this;
	}
	public UserBuilder setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
		return this;
	}
	
	public User getUser() {
		return new User(id,firstname,lastname,gender,email,mobilenum,identity,password);
	}
	
}
