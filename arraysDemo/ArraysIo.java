package arraysDemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 2, 2025
 * Time :10:02:18 AM
 * Project :CoreJava
*/

public class ArraysIo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[]= {12,23,34,56,67,78,90,24,46,68,80};
		
		System.out.println("****************Marks array***************");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]+ "\t");
		}
		
		System.out.println();
		System.out.println("Size	"+ marks.length);
		System.out.println("First element	"+ marks[0]);
		System.out.println("Last	"+ marks[marks.length-1]);
		
		//enter values
		Scanner sc =new Scanner(System.in);
		System.out.println("Total students");
		int n= sc.nextInt();
		
		int m2[]= new int[n];
		
		for (int i = 0; i < n; i++) {
			m2[i]=sc.nextInt();
			
		}

		System.out.println("M2 marks list*************************");
		for (int i = 0; i < m2.length; i++) {
			System.out.println( m2[i]+"\t");

		}
		
		System.out.println("********************without loop*********************");
		System.out.println(Arrays.toString(marks));
		
		sc.close();
	}

}
