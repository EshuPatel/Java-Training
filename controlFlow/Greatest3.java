package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :10:22:03 AM
 * Project :CoreJava
 * 
 * find greatest of 3
 * 
*/

public class Greatest3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        int num1, num2 , num3;

        System.out.println("Enter 3 Numbers :");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        num3=scanner.nextInt();
        
        if (num1> num2 && num1>num3) {
        	System.out.println(num1 + " greatest");
			
		} else if(num2> num1 && num2 > num3){
			System.out.println(num2 + " greatest");
		}
		else if(num2== num1 && num2 == num3){
			System.out.println(" All equal");
		}
		else {
			System.out.println(num3 + " greatest");
		}
        
        scanner.close();
	}

}
