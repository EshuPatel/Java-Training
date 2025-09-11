package collxnsDemo.listDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :10:21:19 AM
 * Project :CoreJava
*/

//add elemsnts , manipulation and retrieving
public class ArrayListDemo1 {
	public static void main(String[] args) {
		
		
		//generic arraylist of type String
		ArrayList<String> p1= new ArrayList<String>();
		
		//maintains order of insertion
		p1.add("Java");
		p1.add("perl");
		p1.add("C++");
		p1.add("C# 5.0");
		p1.add("Java"); //stores duplicates
		p1.add("Python");
		
		
		//display arraylist as list
		System.out.println("Prgmming langs ArrayList  "+p1);
		
		
//		access elements using get() method
		System.out.println("Element at index[0]"+ p1.get(1));
		
		System.out.println("Does it contain \"Java\"" + p1.contains("Java"));
		
		//add at specific index
		p1.add(2, "Oracle");
		System.out.println("display : "+ p1);
		
//		manipulations
		System.out.println("is it empty..??"+ p1.isEmpty());
		System.out.println("position of Python  "+ p1.indexOf("Python"));
		System.out.println("List size is  : "+ p1.size());
		
//		creating to store marks
		ArrayList<Integer> marks = new ArrayList<Integer>(5);
		marks.add(34); //autoboxing:- converting primitive type to object
		marks.add(89);
		marks.add(88);
		marks.add(93);
		marks.add(84);
		marks.add(56);
		marks.add(56);
		marks.add(56);
		marks.add(56);
		
		
//		marks.add("Hello"); //Compiler Error - Type Safety

        System.out.println("The Marks ArrayList is :"+marks);
        System.out.println("The Size of Marks ArrayList is : "+marks.size());
        System.out.println("The Marks at 3rd index is : "+marks.get(3)); // AutoUnboxing - Convert Object to primitive type

        Collections.sort(marks);
        System.out.println("Marks ArrayList after Sorting :"+marks);
		
	}
}
