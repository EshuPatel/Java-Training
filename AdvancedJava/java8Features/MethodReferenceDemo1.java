package java8Features;

/**
 * Author : Eshu.Patel
 * Date : Sep 11, 2025
 * Time :3:12:02 PM
 * Project :Advanced Java
 */

//Method Reference - Shorthand of Lambda expression to call method

@FunctionalInterface
interface MyInterface
{
	void myMethod(int a);
}

class Test // instance class
{
	void display(int x) // instance method
	{
		System.out.println("Iam a Instance Method"+x);
	}
}


public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		//traditional approach
		Test t1= new Test();
		t1.display(100);


		MyInterface m1ref=t1::display;

		//calling method of FI
		m1ref.myMethod(200);


	}

}
