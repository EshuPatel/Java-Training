package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :3:00:45 PM
 * Project :CoreJava
*/

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, fact=1;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Number : ");
        num=scanner.nextInt();
        scanner.close();

        for (int i = 1; i <=num; i++) {
           fact*=i;
        }
        System.out.println("The Factorial of "+num+" is: "+fact);

	}

}
