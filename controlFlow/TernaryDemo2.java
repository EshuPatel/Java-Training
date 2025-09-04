package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :11:51:59 AM
 * Project :CoreJava
 * 
 * Program to Check whether entered alphabet using Ternary Operator
 * 
*/

public class TernaryDemo2 {

	public static void main(String[] args) {
		char myChar;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter char");
		myChar= scanner.next().charAt(0);
		
		//ternary operator
		String output = (myChar >= 'a' && myChar <='z') || (myChar >= 'A' && myChar <= 'Z') ? myChar + "is an Alphabet" : myChar+ "is not an alphabet";
		System.out.println(output);
		
		
		
		scanner.close();
		
		
		
	}

}
