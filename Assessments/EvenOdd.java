package assessments;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 12, 2025
 * Time :3:58:39 PM
 * Project :CoreJava
*/

public class EvenOdd {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

		System.out.println("Enter num :  ");
		int n= s.nextInt();
		
		if(n%2==0) System.out.println("Even");
		else System.out.println("Odd");
		
	}
	
}
