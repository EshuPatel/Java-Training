package mapsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :4:19:41 PM
 * Project :CoreJava
*/

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(new Student(11, "Rim", 30));
		al.add(new Student(12, "Tim", 4));
		al.add(new Student(13, "Dim", 50));
		
		
		
		Collections.sort(al);
		System.out.println("***********************Students sorted on basis of age********************");
		for(Student st: al)  {System.out.println(st.getRollNo()+"  "+ st.getName()+ "  "+ st.getAge());}
	}

}
