package controlFlow;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :4:08:25 PM
 * Project :CoreJava
*/

public class NestedLoopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1 ; i <=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*  ");
				
			}
			System.out.println();
		}

	}

}
