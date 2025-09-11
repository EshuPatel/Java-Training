package oopsDemo4;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :2:38:00 PM
 * Project :CoreJava
*/

public class Director extends Employee{
	

	double transportAllowance;
	private String department;

	public Director(String name, double basic, String address, double ta) {
		super(name, basic, address);
		this.transportAllowance=ta;
	}
	
	double totalPay(){
		double totalAmount = 0;
	    double houseRentAllowance = (basic * 0.08);
	    double dearnessAllowance = (basic * 0.3);
	    double medicalAllowance = 1500;
	    totalAmount = basic + houseRentAllowance+ dearnessAllowance + medicalAllowance;
	    
	    return totalAmount;
	}

	 
}
