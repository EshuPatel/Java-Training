package mapsDemo;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :3:25:50 PM
 * Project :CoreJava
 */

//Employee class to represent an employee assigned to a manager
public class Employee {

	private int id;
	private String name;
	private String department;

	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	

	public void display() {
		// TODO Auto-generated method stub
		System.out.printf("      [Employee ID: %d | Name: %-10s | Department: %s]%n", id, name, department);
	}
}
