package mapsDemo;

import java.util.Objects;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :3:28:54 PM
 * Project :CoreJava
 */


// Manager class to represent a manager in the organization.
// He can have multiple employees assigned to him.

public class Manager {
	
	private int id;
	private String name;


	public Manager(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	   

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id, name);
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	public void display() {
		// TODO Auto-generated method stub
		 System.out.printf("👨‍💼 Manager ID: %d | Name: %s%n", id, name);
	}
    
//    override eauals & hashCode so HashMap can identify managers uniquely
    


}
