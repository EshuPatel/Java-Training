package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Aug 30, 2025
 * Time :11:44:22 AM
 * Project :CoreJava
*/

//Program to Calculate Simple Interest for a Loan Amount gr8r than 1L 

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String customerName;
		double principal;
		float si;
		int term,rate;
		
		///Create scanner object for taking input at runtime
		Scanner scan = new Scanner(System.in);
		
		//Input
		System.out.println("*********** Soft Bank - Simple Interest Calculation *********");
		System.out.println("Enter Customer Name : ");
		customerName=scan.nextLine();//Multiple words input
		System.out.println("Enter Loan Amount   : ");
		principal=scan.nextDouble();
		System.out.println("Enter Loan Term     : ");
		term=scan.nextInt();
		System.out.println("Enter Rate of Interest :");
		rate=scan.nextInt();
		
		
		
		if (principal>100000) {
			//Calculate Simple Interest
			si=(float) (principal*term*rate)/100;
			
			//Output
			System.out.println("************ Loan Details ************************");
			System.out.println("Customer Name           : "+customerName);
			System.out.println("Principal Amount        : "+principal);
			System.out.println("Term                    : "+term);
			System.out.println("Rate of Interest        : "+rate);
			System.out.println("--------------------------------------------------");
			System.out.println("Simple Interest         : "+si);
			System.out.println("--------------------------------------------------");
		}
		
		else {
			System.out.println("Sryy😒😒😒...Not eligible for loan.");
		}
		scan.close();

	}

}
