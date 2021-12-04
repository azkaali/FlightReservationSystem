import java.io.IOException;

public class LoginInfo {
	private String email;
	private String password;
	
	
	
	public LoginInfo() {
		
	}
	public LoginInfo(String email, String password) throws Exception{
		if(email.isEmpty()) {
			throw new EmptyStringException("Email cannot be empty");
		}
		if(password.isEmpty()) {
			throw new EmptyStringException("Passwrd cannot be empty");
		}
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

		if(!email.matches(regex)) {
			throw new InvalidEmailException("Email is Invalid");
		}
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws InvalidEmailException, EmptyStringException {
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
	public void setPassword(String password) throws IOException {
		if(password.isEmpty()) {
			throw new IOException("Passwrd cannot be empty");
		}
		this.password = password;
	}
	
	public Boolean searchLogin(String email, String password) {
		
		if(this.email.equalsIgnoreCase(email) && this.password.equals(password)) {
			return true;
		}
		return false;
	}
	
	public Boolean searchEmail(String email) {
		if(this.email.equalsIgnoreCase(email)) {
			return true;
		}
		return false;
	}
	
	

}
