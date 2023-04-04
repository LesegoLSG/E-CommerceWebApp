package userdetails.user;

public class User implements IUser{
	
	private int id;
	private String firstname;
	private String lastname;
	private String gender;
	private String email;
	private String password;
	private String identity;
	private String mobilenum;
	
	public User(int id, String firstname, String lastname, String gender, String email, String password,
			String identity, String mobilenum) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.identity = identity;
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

	public String getIdentity() {
		return identity;
	}

	public String getMobilenum() {
		return mobilenum;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", email=" + email + ", password=" + password + ", identity=" + identity + ", mobilenum=" + mobilenum
				+ "]";
	}
	
	
	
	

}
