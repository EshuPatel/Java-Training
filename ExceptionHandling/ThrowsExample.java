package ExceptionHandling;

import java.io.IOException;

/**
 * Author : Eshu.Patel
 * Date : Sep 6, 2025
 * Time :3:49:53 PM
 * Project :CoreJava
*/

public class ThrowsExample {
	
	void myMethod(int a) throws IOException, ArithmeticException{
		if(a==1) throw new IOException("IOException Occured");
		else throw new ArithmeticException("Arithmetic Exception");
	}
	
	public static void main(String[] args) {
		ThrowsExample t= new ThrowsExample();
		
		try {
			t.myMethod(1);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

}
