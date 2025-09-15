package assessments;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 12, 2025
 * Time :3:49:30 PM
 * Project :CoreJava
 */

public class AgeCalculator {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

		int age;
		final int CURR_YEAR =2025;
		System.out.println("Enter age :  ");
		age= s.nextInt();

		System.out.println("You are " + (CURR_YEAR-age)+ "years old.");

	}

}
