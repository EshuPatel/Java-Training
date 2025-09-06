package oopsDemo3;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :9:58:55 AM
 * Project :CoreJava
*/

public class Ticket {
	 private String movieName;
	 private double price;
	 
	 public Ticket(String movieName, double price) {
		this.movieName = movieName;
		this.price = price;
	 }
	    public void showTicketDetails() {
	        System.out.println("Movie: " + movieName);
	        System.out.println("Price: " + price);
	    }
	 
}
