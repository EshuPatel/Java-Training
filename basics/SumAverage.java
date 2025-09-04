package basics;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Aug 30, 2025
 * Time :9:34:19 AM
 * Project :CoreJava
 * 
 * 
 * Calculate sum and average of set of nums using scanner input
*/
  
public class SumAverage {
	
	public static void main(String[] args) {
		
		int num1, num2, num3, sum;
		float avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter org" ); 
		String org= sc.nextLine();
		
		System.out.println("Enter 3 nums" ); 
		num1= sc.nextInt();
		num2=sc.nextInt();
		num3= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name" ); 
		String name= sc.nextLine();
		
		sum=num1+ num2+ num3;
		avg= (float)sum/3;
		
		System.out.println("Sum = "+ sum + "    Average= "+ avg);
		System.out.println("Coded by "+ name + " for  "+ org);
		
		sc.close();
		
	}

}
