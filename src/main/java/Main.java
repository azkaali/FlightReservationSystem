import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InvalidPassportNumberException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("-------------------------");
		System.out.println(
				"FLIGHT RESERVATION SYSTEM");
		System.out.println("1. Sign in As Admin");
		System.out.println("2. Sign in as customer");
		System.out.println("3. Exit");
		System.out.println("--------------------------");
		
		Admin azka=new Admin();
		try {
			azka = new Admin("Azka","Female",19,"F-7",
					 new LoginInfo("azka@gmail.com", "1234"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Boolean loginStatusAdmin=false;
		Boolean loginStatusUser=false;

		ArrayList<Passenger> passengers = new ArrayList<Passenger>();
		ArrayList<Flight> flights = new ArrayList<Flight>();
		ArrayList<Ticket> seat = new ArrayList<Ticket>();
		LinkedList<String> destinationlist;
		
		System.out.println("Select an option");
		System.out.println("--------------------------");
		input = new Scanner(System.in);
		int option=input.nextInt();
		if(option==1)
		{
			System.out.print("Enter email: ");
			input = new Scanner(System.in);
			String email = input.nextLine();
			System.out.print("Enter password: ");
			input = new Scanner(System.in);
			String password = input.nextLine();
			try {
				if (azka.getCredentials().searchLogin(email, password)) {
					System.out.println("Login Successfully");
					loginStatusAdmin = true;
				} else {
					System.out.println("Incorrect Email or Password");

				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			if(loginStatusAdmin == true)
			{
			System.out.println("-------------------------");
			System.out.println(
					"ADMIN MENU");
			System.out.println("1. Add a Flight");
			System.out.println("2. Cancel a Flight");
			System.out.println("3. View All Flights");
			System.out.println("--------------------------");
			System.out.println("Select an option");
			System.out.println("--------------------------");
			input = new Scanner(System.in);
			int choice=input.nextInt();
			if(choice==1)
			{
				System.out.println("Enter Flight ID");
				input = new Scanner(System.in);
				String id = input.nextLine();
				
				System.out.println("Enter Departure Date");
				input = new Scanner(System.in);
				String date=input.nextLine();
				
				System.out.println("Enter Source");
				input = new Scanner(System.in);
				String source = input.nextLine();
				
				System.out.println("Enter Destination");
				input = new Scanner(System.in);
				String dest = input.nextLine();
				
				System.out.println("Enter Plane Name");
				input = new Scanner(System.in);
				String plane = input.nextLine();
				
				Flight f=new Flight(id,date,source,dest,plane);
				flights.add(f);
				//System.out.println(flights.get(0));
				for(int i=0;i<flights.size();i++) {
					System.out.println("Flight Added Successfully");
					System.out.println("Flight ID "+flights.get(i).getFlightNumber()+" Departure Date "+flights.get(i).getDepartureDate()+" Source "+flights.get(i).getSource()+" Destination "+flights.get(i).getDestination()+" Plane Name "+flights.get(i).getAeroplane());
					
					
				}
				/*FileOutputStream create_f = new FileOutputStream("Flights.txt");
			    ObjectOutputStream o=new ObjectOutputStream(create_f);
			    o.writeObject(f);
			    */
				 File create_f = new File("Flights.txt");
			      FileWriter fileWriter1 = new FileWriter(create_f, true);
			      BufferedWriter bufferWriter1 = new BufferedWriter(fileWriter1);
			      bufferWriter1.write("FlightID		Date	Source	Destination	Plane");
			      bufferWriter1.newLine();
			      bufferWriter1.write(id);
			      bufferWriter1.write("		");
			      bufferWriter1.write(date);
			      bufferWriter1.write("		");
			      bufferWriter1.write(source);
			      bufferWriter1.write("		");	
			      bufferWriter1.write(dest);
			      bufferWriter1.write("		");
			      bufferWriter1.newLine();

			      bufferWriter1.close();
			      fileWriter1.close();
			}
			else if(choice==2)
			{
			System.out.println("Enter Flight ID of the flight you wish to cancel");
			input = new Scanner(System.in);
			String id = input.nextLine();
			
			flights.remove(id);
			
			for(int i=0;i<flights.size();i++) {
				System.out.println("Flight Removed Successfully");
				System.out.println("Flight ID "+flights.get(i).getFlightNumber()+" Departure Date "+flights.get(i).getDepartureDate()+" Source "+flights.get(i).getSource()+" Destination "+flights.get(i).getDestination()+" Plane Name "+flights.get(i).getAeroplane());
				
			}	
			}
			else if(choice==3)
			{
				//FILE READING KA BASIC CODE LIKH DO JISMAY PURI FLIGHTS.TXT READ HORHI HO

				FileReader fr=null;
				try
				{
					fr = new FileReader("Calendar.txt");
				}
				
				catch (FileNotFoundException fe)
				{
					System.out.println("File not found");
				}

				Scanner input2 = new Scanner(fr); 
				 
				while (input2.hasNextLine()) {
				  String word  = input2.nextLine();
				  System.out.println(word);
					}
			}
			
			}
			}
			
		
		
		if(option==2)
		{
			System.out.print("Pick one.\n1. Sign IN \n2. Sign UP ");
			input = new Scanner(System.in);
			String pick = input.nextLine();
			if(pick.equalsIgnoreCase("1"))
			{
				System.out.print("Enter email: ");
				input = new Scanner(System.in);
				String email = input.nextLine();
				System.out.print("Enter password: ");
				input = new Scanner(System.in);
				Passenger a=new Passenger();
				String password = input.nextLine();
				try {
					if (!(email.isEmpty())&&!(password.isEmpty())) {
						System.out.println("Login Successful");
						loginStatusUser = true;
					} else {
						System.out.println("Incorrect Email or Password");

					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				
			}
			else if(pick.equalsIgnoreCase("2"))
			{
				System.out.print("Enter email: ");
				input = new Scanner(System.in);
				String email = input.nextLine();
				System.out.print("Enter password: ");
				input = new Scanner(System.in);
				String password = input.nextLine();
				System.out.print("Enter name: ");
				input = new Scanner(System.in);
				String name = input.nextLine();
				System.out.print("Enter age: ");
				input = new Scanner(System.in);
				int age = input.nextInt();
				System.out.print("Enter gender: ");
				input = new Scanner(System.in);
				String gender = input.nextLine();
				System.out.print("Enter address: ");
				input = new Scanner(System.in);
				String address = input.nextLine();
				
				Passenger p=new Passenger(email,password,age, name,gender,address);
				passengers.add(p);
				//System.out.println(flights.get(0));
				for(int i=0;i<passengers.size();i++) {
					System.out.println("Account Created Successfully");
					//System.out.println("Passenger email "+passengers.get(i).getEmail()+" Password "+passengers.get(i).getPassword());
					
				}
			}
			if(loginStatusUser == true)
			{
				System.out.println("-------------------------");
				System.out.println(
						"ADMIN MENU");
				System.out.println("1. Book a Flight");
				System.out.println("2. Cancel a Booking");
				System.out.println("3. View All Flights");
				System.out.println("--------------------------");
				System.out.println("Select an option");
				System.out.println("--------------------------");
				input = new Scanner(System.in);
				int choice=input.nextInt();
				if(choice==1)
				{
					System.out.println("-------------------------");
					System.out.println(
							"FLIGHT BOOKING MENU");
					System.out.println("--------------------------");
					System.out.println("Enter Passport Number");
					input = new Scanner(System.in);
					String passport=input.nextLine();
					if(passport.length()<10||passport.length()>10)
					{
						throw new InvalidPassportNumberException("The passport number isn't valid");
					}
					else 
					{
						System.out.println("Enter Destination");
						input = new Scanner(System.in);
						String dest=input.nextLine();
						System.out.println("Enter Plane Class");
						input = new Scanner(System.in);
						String classs=input.nextLine();
						Ticket t=new Ticket(passport,dest,classs);
						seat.add(t);
						for(int i=0;i<passengers.size();i++) {
							System.out.println("Ticket Booked");
							//System.out.println("Passenger email "+passengers.get(i).getEmail()+" Password "+passengers.get(i).getPassword());
							
						}
					}

				}
				if(choice==2)
				{
					System.out.println("-------------------------");
					System.out.println(
							"FLIGHT CANCELLATION");
					System.out.println("--------------------------");
					
					
				}
				if(choice==3)
				{
					System.out.println("-------------------------");
					System.out.println(
							"VIEWING FLIGHT CALENDAR");
					System.out.println("--------------------------");
					FileReader fr=null;
					try
					{
						fr = new FileReader("Calendar.txt");
					}
					
					catch (FileNotFoundException fe)
					{
						System.out.println("File not found");
					}

					Scanner input2 = new Scanner(fr); 
					 
					while (input2.hasNextLine()) {
					  String word  = input2.nextLine();
					  System.out.println(word);
						}
					
				}
				
			}
			
		}
		
		
		
	}

}
