package java8Features;

/**
 * Author : Eshu.Patel
 * Date : Sep 11, 2025
 * Time :3:16:51 PM
 * Project :Advanced Java
*/


@FunctionalInterface
interface IDemo
{
	void sum(int  x,int y);
}

class Calculation
{
	void addition(int  a,int b)
	{
		System.out.println("The Addition is : "+(a+b));
	}
}


public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		
		Calculation c1=new Calculation();
				
				//using Lambda expressions
				IDemo d1=(a,b)->System.out.println("The Addition is : "+(a+b));
				d1.sum(10, 45);
				
				//Using Method reference to call instance method
				IDemo d2=c1::addition;
				d2.sum(200,150);
				d2.sum(400, 200);
				// TODO Auto-generated method stub

	}

}
