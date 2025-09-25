package streamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author : Eshu.Patel
 * Date : Sep 12, 2025
 * Time :9:56:37 AM
 * Project :Advanced Java
*/

public class SttreamExample1 {

	public static void main(String[] args) {
		Integer[] marks = {23,12,45,23,55,67,87,54};
		
		//Build stream for Arrays
		Stream<Integer> strm = Stream.of(marks);
		
		
		//Terminal operation- forEach()
		//Lambda expressions are used as parameters to another func.
		strm.forEach(i -> System.out.println(i));
		
		System.out.println("**************************");
		Stream<Integer> strm1 = Stream.of(marks);
		strm1.filter(i -> i>50).forEach(i -> System.out.println(i));
		
		
		  System.out.println("************* Array Contents **************");
			List<Integer> grades=new ArrayList<Integer>();
			grades.add(10);
			grades.add(6);
			grades.add(5);
			grades.add(7);
			grades.add(8);
			grades.add(9);
			
			//Build stream from Collections
			Stream<Integer> strm11=grades.stream();
			
			//strm1.forEach(i->System.out.println(i));
			System.out.println("************* ArrayList Contents **************");
			strm11.forEach(System.out::println);
			
			// Intermediate operations - map() & terminal operations - collect()
			List<Integer> squares=grades.stream().map(m->m*m)
					.collect(Collectors.toList());
			
			System.out.println("************** Double of Grades ************");
			System.out.println(squares);

	}

}
