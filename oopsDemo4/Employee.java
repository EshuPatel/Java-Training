package oopsDemo4;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :2:37:02 PM
 * Project :CoreJava
*/

public abstract class Employee {
	 private String name;
	 protected double basic;
	 private String address;
	 
	 public Employee(String name, double basic, String address) {
		this.name = name;
		this.basic = basic;
		this.address = address;
	 }
	 
	void show() {
		System.out.println("Name\t"+name);
		System.out.println("Address\t"+address);
		System.out.println("Basic\t"+basic);
	}
	
	double deduction(int leave) {
		double lessPay;
		
		if(leave==0) lessPay=0;
		
		else if(leave<=5) lessPay=basic *0.25;
		
		else lessPay= 0.5*basic;
		
	return lessPay;}
	
	abstract double totalPay();
        
 
}
