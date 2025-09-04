package oopsDemo2;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 4, 2025
 * Time :9:58:09 AM
 * Project :CoreJava
*/

public class MultiLevel1 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Account Details of Customer(Cust No,Name, Balance):");
		
		int custNo=scanner.nextInt();
		scanner.nextLine();
		String name=scanner.nextLine();
		int balance=scanner.nextInt();
		final int MIN_BAL=1000;
		System.out.println("Enter Amount to Deposit:");
		int deposit=scanner.nextInt();
		System.out.println("Enter Amount to Withdraw:");
		int withdraw=scanner.nextInt();
		
		AccDetails a1= new AccDetails(custNo, name, MIN_BAL, balance, withdraw, deposit);
		
		a1.display();
		scanner.close();
		
	}
	
}
