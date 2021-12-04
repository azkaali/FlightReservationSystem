import java.io.IOException;

public class Payment {
private String cardno;
private Passenger pname;
private int amount;
public Payment(String cardno, Passenger pname, int amount) {
	super();
	this.cardno = cardno;
	this.pname = pname;
	this.amount = amount;
}
public String getCardno() {
	return cardno;
}
public void setCardno(String cardno) throws Exception {
	if(cardno.isEmpty())
	{
		throw new Exception("Card number can't be empty");
	}
	this.cardno = cardno;
}
public Passenger getPname() {
	return pname;
}
public void setPname(Passenger pname) {
	this.pname = pname;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Payment [cardno=" + cardno + ", pname=" + pname + ", amount=" + amount + "]";
}



}
