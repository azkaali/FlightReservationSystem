import java.io.FileWriter;
import java.io.IOException;

public class Reservation {
	private Passenger passenger;
	private Flight flight;
	private Payment payment;
	Ticket reservedSeats;
	String requiredDestination;
	Boolean status=false;
	
	public Reservation() {
	}
	
	public Reservation(Passenger passenger, Flight flight, Ticket reservedSeats, String requiredDestination) {
		this.passenger = passenger;
		this.flight = flight;
		this.reservedSeats = reservedSeats;
		this.requiredDestination=requiredDestination;
	}
	
	public Reservation(Passenger passenger, Flight flight, Payment payment, Ticket reservedSeats, String requiredDestination) {
		this.passenger = passenger;
		this.flight = flight;
		this.reservedSeats = reservedSeats;
		this.requiredDestination=requiredDestination;
	}
	
	public void makeReservation(Passenger passenger, Flight flight, Payment payment, Ticket reservedSeats,  String requiredDestination) {
		this.passenger = passenger;
		this.flight = flight;
		this.reservedSeats = reservedSeats;
		this.requiredDestination=requiredDestination;
	}
	
	public Ticket getReservedSeats() {
		return reservedSeats;
	}

	public void setReservedSeats(Ticket reservedSeats) {
		this.reservedSeats = reservedSeats;
	}

	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	

}
