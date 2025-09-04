package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :12:10:46 PM
 * Project :CoreJava
 * 
 * 
 * Program to demonstrate Constructors
 * Constructors are used to initialize an Object

 * 
*/

public class Candidate {
	
	private int id;
	private String name;
	private float stipend,da;
	
	// Parameterized constructor - To initialize an Object Values
	public Candidate(int id, String name, float stipend) {
		this.id = id;
		this.name = name;
		this.stipend = stipend;
	}
	
	public void calDA() {
		this.da=this.stipend*.10f;
	}
	
	void display() {
		System.out.println("*********************************************");
		System.out.println("Candidate Id "+ id);
		System.out.println("Candidate Name "+ name);
		System.out.println("Candidate Stipend "+ stipend);
		System.out.println("Candidate Daily ALlowance "+ da);
	}
}