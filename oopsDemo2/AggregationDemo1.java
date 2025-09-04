package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 4, 2025
 * Time :11:53:32 AM
 * Project :CoreJava
*/

public class AggregationDemo1 {

	public static void main(String[] args) {
		Address a1= new Address("Bengluru", "Krntka", "Ind",4752473);
		Address a2= new Address("pragey", "austin", "USA",4343743);
		
		Student s1= new Student(11, "rea", a1);
		Student s2= new Student(112, "ruta", a2);
		
		s1.display();
		s2.display();

	}

}
