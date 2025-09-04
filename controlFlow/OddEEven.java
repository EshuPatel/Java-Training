package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :10:04:49 AM
 * Project :CoreJava
 * 
 * Check if entered no. is odd or even
 * 
*/

public class OddEEven {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 nums");
		num= sc.nextInt();
		
		if (num %2 ==0) {
			System.out.println(num + "  is even");
		} 
		else {
			System.out.println(num + "  is odd");
		}
		sc.close();
	}

}
