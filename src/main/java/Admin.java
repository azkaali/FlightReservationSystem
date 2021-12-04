import java.io.IOException;

public class Admin extends Person {
	
	public Admin(String name, String gender, int age, String address) {
		super(name, gender, age, address);
		// TODO Auto-generated constructor stub
	}
	
	public Admin() {
		super();// TODO Auto-generated constructor stub
	}

	public Admin(String name, String gender, int age, String address,
			LoginInfo credentials) {
		super(name, gender, age, address);
		this.credentials = credentials;
	}

	private LoginInfo credentials;
	
	public LoginInfo getCredentials() {
		return credentials;
	}
	public void setCredentials(LoginInfo credentials) {
		this.credentials = credentials;
	}

		
	

}
