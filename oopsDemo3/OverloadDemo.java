package oopsDemo3;

/**
 * Author : Eshu.Patel
 * Date : Sep 4, 2025
 * Time :2:36:27 PM
 * Project :CoreJava
*/

//Program to demonstrate Method Overloading. - Static Polymorphism
//*
//* Overload add() method with different type/no. of Arguments

class Addition{
	
	public void add() {
		System.out.println("**********Method Overloading Demo********\n");
	}
	
	public void add(int a, int b) {
		System.out.println("Adding 2 int nos."+ (a+b));
	}
	
	public void add(double a, double b) {
		System.out.println("Adding 2 dbl nos.	"+ (a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Adding 3 int nos.	"+ (a+b+c));
	}
	
	public void add(String s1, String s2) {
		System.out.println("Adding 2 str vals.	"+ (s1+s2));
	}
}



public class OverloadDemo {
	public static void main(String[] args) {
		
		Addition a1= new Addition();
		
//		Invoke Overloaded add() mthd
		a1.add();
		a1.add(20, 23.03f);
		a1.add(20, 30.5f);
		a1.add(23, 43, 34);
		a1.add("Saniya", "Mirza");
	}
}
