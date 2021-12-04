
public class Ticket {
private String ticketID;
private String destination;
private String planeclass;

public Ticket(String ticketID, String planeclass, String destination) {
	super();
	this.ticketID = ticketID;
	this.planeclass = planeclass;
	this.destination = destination;
}
@Override
public String toString() {
	return "Ticket [ticketID=" + ticketID + ", planeclass=" + planeclass + ", destination=" + destination + "]";
}
public String getTicketID() {
	return ticketID;
}
public void setTicketID(String ticketID) {
	this.ticketID = ticketID;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getPlaneclass() {
	return planeclass;
}
public void setPlaneclass(String planeclass) {
	this.planeclass = planeclass;
}



}
