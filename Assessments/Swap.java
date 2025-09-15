package assessments;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :9:17:23 AM
 * Project :CoreJava
*/

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int a, b, temp;
		System.out.println("Enter 2 values for A and B :  ");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Values of A and  b respectively before swapping :  "+ a+"  "+b);
		
//		swap
		temp=a;
		a=b;
		b=temp;
		System.out.println("Values of A and  b respectively after swapping :  "+ a+"  "+b);     
		
		s.close();
	}

}
