package oopsDemo4;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :12:57:02 PM
 * Project :CoreJava
*/

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee t1=new Marks("John","New York",1001,35);  // up casting

		t1.show(); // invoke abstract base class method
		double marks=t1.calcMarks();  // invoke sub class method
		System.out.println(t1 +" "+marks);

	}

}
