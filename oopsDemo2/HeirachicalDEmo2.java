package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 4, 2025
 * Time :10:58:15 AM
 * Project :CoreJava
*/

//
//*          Customer
//* RegisteredCustomer               GuestCustomer


public class HeirachicalDEmo2 {

	public static void main(String[] args) {
		

		RegisteredCustomer regCust=new RegisteredCustomer("Mike Doe","doe@test.com",988910);
		GuestCustomer gCust=new GuestCustomer("Jane Smith","jane@test.com");

		System.out.println("******** StopShop Shopping Portal **********");
		System.out.println(" --- Registered Customer Details ---");
		regCust.displayCustomerInfo();
		regCust.addToCart("Lenova Laptop");
		regCust.addToCart("Samsung S24 CellPhone");
		regCust.addToCart("Boat EarBuds");
		regCust.addToCart("Logitech Mouse");
		regCust.addToCart("HP PenDrive");
		System.out.println("\n --- Cart Details of Registered Customer ---");
		regCust.displayCart();

		System.out.println("\n ---Guest Customer Details ---");
		gCust.display();
		gCust.addToCart("PocoF5 Cellphone");
		gCust.addToCart("DELL LED Monitor");
		gCust.addToCart("Lenova Laptop");
		gCust.addToCart("Samsung S24 CellPhone");
		gCust.addToCart("Boat EarBuds");
		gCust.addToCart("Logitech Mouse");
		  gCust.addToCart("HP PenDrive");
		System.out.println("\n --- Cart Details of Guest Customer ---");
		gCust.displayCart();


	}

}
