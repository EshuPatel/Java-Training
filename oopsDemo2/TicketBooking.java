package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 4, 2025
 * Time :12:37:21 PM
 * Project :CoreJava
*/

public class TicketBooking {
	//TicketBooking class (Has-A Payment using Composition)


	private String bookingId;
	    private String passengerName;
	    private String flightNumber;
	    private String destination;
	    private Payment payment;   // Composition → Strong Has-A Relationsh
	    
	    
	    
	    
	     public TicketBooking(String bookingId, String passengerName, String flightNumber, String destination,
	    		 String paymentId, double amount, String mode) {
	    	 super();
			this.bookingId = bookingId;
			this.passengerName = passengerName;
			this.flightNumber = flightNumber;
			this.destination = destination;
			
			//payment created wd booking--------> composition
			this.payment = new Payment(  paymentId,  amount,  mode);
		}

		 public void displayBooking() {
		        System.out.println("\n===== Booking Details =====");
		        System.out.println("Booking ID: " + bookingId);
		        System.out.println("Passenger: " + passengerName);
		        System.out.println("Flight Number: " + flightNumber);
		        System.out.println("Destination: " + destination);
		        payment.displayPayment(); // Delegation
		    }

		    public String getBookingId() {
		        return bookingId;
		    }
}
