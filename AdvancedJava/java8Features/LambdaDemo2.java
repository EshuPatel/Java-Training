package java8Features;

/**
 * Author : Eshu.Patel
 * Date : Sep 11, 2025
 * Time :2:17:07 PM
 * Project :Advanced Java
*/

public class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isEven= (n)-> (n%2==0);
		NumericTest isNegative= (n)-> (n<0);
		
		System.out.println("7 is Even number:  " + isEven.computeTest(7));
		System.out.println("-55 is Negative number:  "+ isNegative.computeTest(-55));
		
//		boolean a= (n)-> (n%2==0); //error --lambda expressions 
		}

}
