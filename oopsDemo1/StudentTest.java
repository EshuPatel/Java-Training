package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 2, 2025
 * Time :4:25:37 PM
 * Project :CoreJava
*/

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Create OBject of Studen class
		Student s1 = new Student();
		Student s2= new Student();
		
//		invoke methods of student class using . operator
		s1.input();
		float tot= s1.calculate();
		s1.display();
		System.out.println("Total Displayed from main: "+ tot);
		
		
//		invoke methods of student class .operator
		s2.input();
		float tot1= s2.calculate();
		s2.display();
		System.out.println("Total Displayed from main: "+ tot1);
	}

}
