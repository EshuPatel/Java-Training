package collxnsDemo;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :9:31:46 AM
 * Project :CoreJava
 */

//Testing Generic Class Pair with 2 Parameters
public class TwoPairDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> p1 = new Pair<String, Integer>("Car Guys", 101);

		Scanner s= new Scanner(System.in);
		System.out.println("Current rating is"+ p1.getFirst()+ " is "+ p1.getSecond());

		System.out.println("Yo Rate them...");
		int score= s.nextInt();

		p1.setSecond(score);
		System.out.println("New rating for "+ p1.getFirst()+ " is "+ p1.getSecond());


		

		Pair<String,Float> p2=new Pair<String,Float>("TROY",8.5f);

		System.out.println("Our Current Rating for "+p2.getFirst() + " is : "+p2.getSecond());

		System.out.println("How would you rate them ?:");
		float score1 =s.nextFloat();

		p2.setSecond(score1);

		System.out.println("Our New Rating for "+p2.getFirst() + " is : "+p2.getSecond());

	}

}
