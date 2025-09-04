package oopsDemo1;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 2, 2025
 * Time :4:11:17 PM
 * Project :CoreJava
*/

public class Student {
	
	
	//properties/state/attributes
	// private variables can be accessed only within the class
	private  int roll;
	private String name, course;
	private float m1, m2, m3, total;
	
	Scanner s= new Scanner(System.in);
	
	//instance methods/ behavior/ functions
	
	//JVM will invoke default constructor for initialization of object
	
	public void input() {
		System.out.println("Enter roll, name, course");
		roll= s.nextInt();
		name= s.next();
		course = s.next();
		
		System.out.println("Enter marks of 3 subjects");
		m1=s.nextFloat();
		m2=s.nextFloat();
		m3= s.nextFloat();
		
	}

	public float calculate() {
		total= m1+m2+m3;
		return total;
	}
	
	public void display() {
		System.out.println("***********************Student Details*********************");
		System.out.println("Roll		"+ roll);
		System.out.println("Name		"+ name);
		System.out.println("Course		"+ course);
		System.out.println("Total Marks		"+ total);
		System.out.println("***************************************************");
	}
	
	
	
	
	
	
	
	

}
