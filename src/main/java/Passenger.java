import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Passenger extends Person{

	public Passenger(String name, String gender, int age, String address,String email,String password) {
		super(name, gender, age, address);
		// TODO Auto-generated constructor stub
	}
public Passenger() {
		// TODO Auto-generated constructor stub
	}
private String email;
private String password;
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	
	
 

}
