package ie.lyit.flight;
import java.util.*;
public class Booking {

	private Flight outbound;
	private Flight inbound;
	private ArrayList<Passenger> passengers;
	private double totalPrice;
	private static int count;
	
	public Booking() {
		outbound=new Flight();
		inbound=new Flight();
		passengers=new ArrayList<Passenger>();
		totalPrice=0;
		count=count+1;
		
	}
	public Booking(Flight oF,Flight iF, ArrayList<Passenger> p) {
		outbound=oF;
		inbound=iF;
		passengers=p;
		totalPrice=0;
		count=count+1;
		
	}
	public void totalPrice() {
		calculatePrice();
	}
	public void setOutbound(Flight oF) {
		outbound=oF;
	}
	public void setInbound(Flight iF) {
		inbound=iF;
	}
	public void setPassengers(ArrayList<Passenger> p) {
		passengers=p;
	}
	public Flight getOutbound() {
		return outbound;
	}
	public Flight getInbound() {
		return inbound;
	}
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public static int getCount() {
		return count;
	}
	public void calculatePrice() {
		totalPrice=(outbound.getPrice()+inbound.getPrice())*passengers.size();
		
	}
	public boolean findPassenger(Passenger p) {
		if(passengers.contains(p))
			return true;
		else
			return false;
		
	}
	public String toString() {
		return "Oubound " + outbound + " Inbound " + inbound +
				" Passengers " + passengers + " Total Price " +
				totalPrice;
	}
	public boolean equals(Object obj) {
		Booking bTest;
		if(obj instanceof Booking) {
			bTest=(Booking)obj;
			if(bTest.getInbound()==inbound && bTest.getOutbound()==outbound &&
					bTest.getPassengers() == passengers && bTest.getTotalPrice()==totalPrice) {
				return true;
			}
		}else
			return false;
		return false;
	}
}
