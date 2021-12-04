
public class Login {
	private String email;
	private String password;
	
	Login(String email,String password)
	{
		this.email=email;
		this.password=password;
	}

	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmptyStringException, InvalidEmailException {
		if(email.isEmpty()) {
			throw new EmptyStringException("Email cannot be empty");
		}
		
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

		if(!email.matches(regex)) {
			throw new InvalidEmailException("Email is Invalid");
		}
			
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
