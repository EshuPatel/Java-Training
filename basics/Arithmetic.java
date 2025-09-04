

package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author : Eshu.Patel
 * Date : Aug 30, 2025
 * Time :11:26:06 AM
 * Project :CoreJava
 * 
 * perform arithmetic operations using bufferedReader Input
*/



public class Arithmetic {
	
	public static void main(String[] args) throws IOException {
		
		//variables
		int a,b, sum, sub, mul;
		float div;
		String name;
		
		//buffered Reader for input
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		//taking input
		System.out.println("Enter 2 nums");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		
		System.out.println("Name");
		name=br.readLine();
		
		//calculation
		sum=a+b;
		sub= a-b;
		mul=a*b;
		div= a/b;
		
		//printing
		System.out.println("Sum is  "+ sum+ "	Difference is  "+ sub);
		System.out.println("Product is  "+ mul+ "	Division is  "+ div);
		System.out.println("Name is  "+ name);



		
	}

}
