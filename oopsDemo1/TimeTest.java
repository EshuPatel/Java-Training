package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :12:52:29 PM
 * Project :CoreJava
*/

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1= new Time(10, 10, 40);
		Time t2= new Time(33, 50, 40);
		
		
		t1.display();
		t2.display();
		
		t1.add(t2);
		t1.display();
	}

}
