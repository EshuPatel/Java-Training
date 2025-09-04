package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :4:42:52 PM
 * Project :CoreJava
*/

public class Passenger {
	
	private String name;
	private int age;
	private String passportNumber;
	
	
	public Passenger(String name, int age, String passportNumber) {
		this.name = name;
		this.age = age;
		this.passportNumber = passportNumber;
	}
	
	public void displayPassengerInfo() {
		System.out.println("Name"+ name+ "Age"+ age+"Passport Number"+ passportNumber);
	}
	
	
}
