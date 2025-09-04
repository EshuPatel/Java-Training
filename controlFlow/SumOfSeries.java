package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :12:39:33 PM
 * Project :CoreJava
 * 
 * Program to find Sum of Series . 1+2+3+ .....+n

 * 
*/

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n,sum=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Value of N : ");
        n=scanner.nextInt();
        scanner.close();
        
        while (i<=n) {
        	sum+=i;
        	i++;
        }
        System.out.println("Sum of Series "+ n+ "is "+ sum);
		
	}

}
