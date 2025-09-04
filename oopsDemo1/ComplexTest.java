package oopsDemo1;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :12:31:07 PM
 * Project :CoreJava
*/

public class ComplexTest {

	public static void main(String[] args) {
		 
		Complex c1= new Complex(4, 5);
		Complex c2 = new Complex(23.4, 50.4);
		
		c1.add(c2);
		System.out.println("Adding 2 complex nos.");
		c1.display();
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter real nd imag parts");
		double r = s.nextDouble();
		double i =s.nextDouble();
		
		Complex c3= new Complex(r, i);
		
		c3.add(c2);
		System.out.println("Adding again");
		c3.display();

		s.close();
	}

}
