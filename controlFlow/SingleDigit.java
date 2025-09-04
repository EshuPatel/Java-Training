package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :10:10:04 AM
 * Project :CoreJava
 * 
 * Check whether entered num is single digit
 * 
*/ 

public class SingleDigit {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num");
		num= sc.nextInt();
		
		if (num > -10 && num< 10) {
			System.out.println(num + "  is single digit");
		} 
		else {
			System.out.println(num + "  is not single digit");
		}
		sc.close();

	}

}
