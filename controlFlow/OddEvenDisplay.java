package controlFlow;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :12:51:08 PM
 * Project :CoreJava
 * 
 *  Program to display Odd & Even Numbers between 1-10
 *
 * ODD  EVEN
 * ---  ----
 * 1    2
 * 3    4
 * 5    6
 * 7    8
 * 9    10
 * 
*/

public class OddEvenDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		System.out.println("odd\teven");
		System.out.println("---\t----");
		
		while(i<=10) {
			if(i%2 !=0) {
				System.out.print(i + "\t");
			}
			else {
				System.out.print(i+ "\n");
			}
			i++;
		}
		
	}

}
