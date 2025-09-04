package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :12:44:53 PM
 * Project :CoreJava
 * 
 * Java Program to find Sum of Positive Numbers

      
*/

public class SumPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0,num=0;
	        Scanner input =new Scanner(System.in);

	// Loop continues until entered number is Positive
	 while(num>=0) {
		 sum+=num;
		 System.out.println("Number");
		 num= input.nextInt();
		 
	 }
	 
	 System.out.println("Sum of positives nos : "+ sum);
	 input.close();
	}

}
