package oopsDemo2;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :4:44:56 PM
 * Project :CoreJava
*/

public class AirlineBooking extends Passenger {
	
	String flightName;
	String fromCity;
	String toCity;
	int seatNo;
	float ticketPrice;
	
	
	public AirlineBooking(String name, int age, String passportNumber, String flightName, String fromCity,
			String toCity, int seatNo, float ticketPrice) {
		super(name, age, passportNumber);
		this.flightName = flightName;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.seatNo = seatNo;
		this.ticketPrice = ticketPrice;
	}

	Scanner scanner     =new Scanner(System.in);


	public AirlineBooking(String name, int age, String passportNumber) {
		super(name, age, passportNumber);
	}
	
	 void bookTicket() {
			
			System.out.println("Enter Flight Name :");
			flightName = scanner.next();
			System.out.println("Enter From City :");
			fromCity = scanner.next();
			System.out.println("Enter To City :");
			toCity = scanner.next();
			System.out.println("Enter Seat No :");
			seatNo = scanner.nextInt();
			System.out.println("Enter Ticket Price :");
			ticketPrice = scanner.nextFloat();
		}
		
		void displayBookingDetails() {
			System.out.println("************* Booking Details ***********");
			System.out.println("Flight Name  :  " + flightName);
			System.out.println("From City    :  " + fromCity);
			System.out.println("To City      :  " + toCity);
			System.out.println("Seat No      :  " + seatNo);
			System.out.println("Ticket Price :  " + ticketPrice);
		}
	
}
