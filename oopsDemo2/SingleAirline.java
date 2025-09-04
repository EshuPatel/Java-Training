package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :4:54:37 PM
 * Project :CoreJava
*/

public class SingleAirline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AirlineBooking b1= new AirlineBooking("Abc", 23, "VYYG854685");
		
		b1.bookTicket();
		b1.displayPassengerInfo();
		b1.displayBookingDetails();
		
		AirlineBooking b2= new AirlineBooking("rod", 67, "TFTYG8546759");
		
		b2.bookTicket();
		b2.displayBookingDetails();
		b2.displayPassengerInfo();
	}

}
