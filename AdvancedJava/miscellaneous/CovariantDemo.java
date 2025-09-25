package miscellaneous;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Eshu.Patel
 * Date : Sep 12, 2025
 * Time :11:43:28 AM
 * Project :Advanced Java
 */

//In Java 5, The covariant return types are newly introduced. 
//		 * After introduced the covariant return type, Java allows us to change the return type 
//		 * of the overriding method(Method in child class). 
//		 * But the return type of overriding method (Method of child class) 
//		 * must be a subtype of the overridden method (Method of Parent class). 
//		 * If you try to provide the return type of overriding method(Method of child class) 
//		 * with supertype, then it with throw exception at compile time.
//		 * 
//		 * The Covariant method overriding provides a way that you can return the subtype of 
//		 * actually return type of overridden method. 
//		 * It helps the programmer to remove the burden of type casting. 
//		 * This method is mostly used when the overriding method returns an object.



public class CovariantDemo {

	public static void main(String[] args) {

		Record r=new Record();
		System.out.println(r.listOfName());

		System.out.println("*****************");
		Student s1=new Student();
		System.out.println(s1.listOfName());

	}

}
