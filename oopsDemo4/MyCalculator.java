package oopsDemo4;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :4:40:35 PM
 * Project :CoreJava
 */

public class MyCalculator implements IMath {



	Scanner kb;

	@Override
	public void add() {

		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform addition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	@Override
	public void sub() {

		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform subition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a-b;
		System.out.println("Diff of "+a+" and "+b+" is "+s);

	}

	@Override
	public void mul() {

		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform division");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a/b;
		System.out.println("Div of "+a+" and "+b+" is "+s);

	}

	@Override
	public void div() {

		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform multiplication");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+s);

	}

	public static void main(String[] args) {
		MyCalculator m= new MyCalculator();

		m.add();
		m.sub();
		m.div();
		m.mul();
	}

	
}
