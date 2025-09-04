package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :3:09:52 PM
 * Project :CoreJava
*/

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Number : ");
        num=scanner.nextInt();
        scanner.close();

		 
		for(int i=1; i<=10; i++) {
			System.out.println(num + "*" +i+ "=" + num*i);
		}

	}

}
