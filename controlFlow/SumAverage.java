package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :11:28:32 AM
 * Project :CoreJava
 * 
 * Sum and average of 3 nums 
 * 
*/

public class SumAverage {

	public static void main(String[] args) {
		
		int num1, num2, num3, sum;
		float avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter org" ); 
		String org= sc.nextLine();
		
		System.out.println("Enter name" ); 
		String name= sc.nextLine();
		
		System.out.println("Enter 3 nums" ); 
		num1= sc.nextInt();
		num2=sc.nextInt();
		num3= sc.nextInt();
		sc.nextLine();
		
		
		if ((num1>100) && (num2>100) && (num3>100)) {
			sum=num1+ num2+ num3;
			avg= (float)sum/3;
			
			System.out.println("Sum = "+ sum + "    Average= "+ avg);
			System.out.println("Coded by "+ name + " for  "+ org);
		}
		
		else {
			System.out.println("Plzzzzzz enter nums greater tham 100");
		}
		
		sc.close();

	}

}
