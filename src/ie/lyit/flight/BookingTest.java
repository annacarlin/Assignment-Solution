package ie.lyit.flight;
import java.util.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ie.lyit.flight.Booking;

public class BookingTest {
	private Booking b1;
	private ArrayList<Passenger> p;
	private Passenger p1;
	private Flight inbound;
	private Flight outbound;
	
	
	@Before
	public void setUp() throws Exception {
		//construct b1
		b1=new Booking(outbound,inbound,p);
		p=new ArrayList<Passenger>();
		inbound=new Flight("BR215","Derry", "Stanstead", 25, 12, 2018, 12, 40, 16.99);
		outbound=new Flight("BR789","Stanstead", "Derry", 27, 12, 2018, 12, 40, 16.99);
		p1=new Passenger("Mrs", "Anna", "Carlin", 5,8,1998,1,false);
		p.add(p1);
	}

	@Test
	public void testBookingFlightFlightArrayListOfPassenger() {
//		assertEquals(b1.getOutbound(), new Booking());
//		assertEquals(b1.getInbound(), "iF");
//		assertEquals(b1.getPassengers(), 0);
//		assertEquals(b1.getTotalPrice(), 0);
//		assertEquals(b1.getTotalPrice(), 0);
//		assertEquals(b1.getOutbound(), outbound);
//		assertEquals(b1.getInbound(), inbound);
//		assertEquals(b1.getPassengers(),p);
	}

}
