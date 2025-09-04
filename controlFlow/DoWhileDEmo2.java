package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :2:22:53 PM
 * Project :CoreJava
*/

public class DoWhileDEmo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		
		do {
			System.out.println(i+"\t");
			i++;
		}while (i<= 50);
		
		System.out.println("********************************* Guess Names ********************");
		String guess;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Guess my name : ");
			guess = sc.next();
		}while(! "James".equals(guess));
		System.out.println("Congooooooo...!!!" + guess);
		sc.close();
	}

}
