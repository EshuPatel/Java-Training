
package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :9:37:18 AM
 * Project :CoreJava
*/

/**
 * 
 */
public class Greatest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int num1, num2;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 2 nums");
		num1= sc.nextInt();
		num2=sc.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + "  is greater");
		} else {
			System.out.println(num2 + "  is greater");
		}
		sc.close();
	}

}
