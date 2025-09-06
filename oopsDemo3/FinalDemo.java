package oopsDemo3;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :11:54:45 AM
 * Project :CoreJava
*/

final class Hello{
	final void display() {
		System.out.println("This is final Method");
	}
}


class World extends Hello{
	
	final void display() {
		System.out.println("This is final Method");
	}
}

/*
Final Variable - Variable’s content cannot be modified
Final Method - A final method cannot be overridden. 
Final Class - Cannot extend a Final class

*/

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int AGE=10;
		final float PI=3.142f;
		
//		AGE=18;

	}

}
