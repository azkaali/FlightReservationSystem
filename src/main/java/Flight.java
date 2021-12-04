import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Flight implements Serializable {

	 	private String flightNumber;
	    private String departureDate;
	    private String source;
	    private String destination;
		private String aeroplane;
		public String getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getDepartureDate() {
			return departureDate;
		}
		public void setDepartureDate(String departureDate) {
			this.departureDate = departureDate;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getAeroplane() {
			return aeroplane;
		}
		public void setAeroplane(String aeroplane) {
			this.aeroplane = aeroplane;
		}
		public Flight(String flightNumber, String departureDate, String source, String destination, String aeroplane) {
			super();
			this.flightNumber = flightNumber;
			this.departureDate = departureDate;
			this.source = source;
			this.destination = destination;
			this.aeroplane = aeroplane;
		}
	
		
		
	    
}