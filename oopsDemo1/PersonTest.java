package oopsDemo1;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :2:16:08 PM
 * Project :CoreJava
 * 
 * Program to demonstrate working of constructors
 * 
 */

class Person {
	private String name,constituency;
	private int age;
	private Scanner s;

	public Person() {
		System.out.println("Voter Eligibilty Test App");
		age=0;
		constituency="Benguluru";
		s=new Scanner(System.in);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.constituency="Mumbai";
	}
	
	

	public Person(String name, String constituency, int age) {
		this.name = name;
		this.constituency = constituency;
		this.age = age;
	}

	void input()
	{
		System.out.println("Enter ur Name:");
		name=s.nextLine();
		System.out.println("Enter ur Age:");
		age=s.nextInt();
	}

	void print()
	{
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Constituency is :"+constituency);
	}
	
	public class PersonTest{
		public static void main(String[] args) {
			
			Person o1 =new Person();
			
			o1.input();
			o1.print();
			
			System.out.println("----------------------------------------------");
			Person o2= new Person("pik", 78);
			
			o2.print();
			
			System.out.println("----------------------------------------------");
			Person o3= new Person("wen","lko", 56);
			
			o3.print();
			
			System.out.println("----------------------------------------------");
			Scanner s= new Scanner(System.in);
			System.out.println("Enter name,contituency,age ");
			String name= s.next();
			String c= s.next();
			int a= s.nextInt();
			
			Person o4= new Person(name,c, a);
			
			
		}
	}
}
