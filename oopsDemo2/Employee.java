package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :4:19:21 PM
 * Project :CoreJava
 * 
 * Single Inheritance Example
*/

public class Employee {


	private int empId;
	private String name;
	

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}


	  void display()
		{
			System.out.println("********** Employee Details ***************");
			System.out.println("Employee Id :"+empId);
			System.out.println("Employee Name: "+name);
		}


}
