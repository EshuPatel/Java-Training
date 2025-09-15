package assessments;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 12, 2025
 * Time :3:53:18 PM
 * Project :CoreJava
*/

public class BMIcalculator {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

		float ht, wt;
		
		System.out.println("Enter height in kgs:  ");
		ht= s.nextFloat();
		
		System.out.println("Enter weight in meters:  ");
		wt= s.nextFloat();

		float bmi= wt/ (ht*ht);
		System.out.println("Your BMI is :  "+ bmi);
		
	}

}
