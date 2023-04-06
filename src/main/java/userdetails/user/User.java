package userdetails.user;

import java.io.Serializable;


public class User implements IUser{
	
	private int id;
	
	private String firstname;

	private String lastname;
	
	private String gender;
	
	private String email;

	private String password;
	
	private String mobilenum;
	
	public User(int id, String firstname, String lastname, String gender, String email, String password,
			 String mobilenum) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.mobilenum = mobilenum;
	}

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

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", email=" + email + ", password=" + password + ", mobilenum=" + mobilenum + "]";
	}

	
	
	
	
	

}
