package mapsDemo;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :4:12:01 PM
 * Project :CoreJava
*/

//Comaprable interface is used to order the objects of user-defined class

// It provides single sorting sequence only i.e can compare on basis of only one attribute
public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private int age;
	
	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	

	public int getRollNo() {
		return rollNo;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	@Override
	public int compareTo(Student o) {
		if(age==o.age)	return 0;
		else if(age>o.age)	return 1;
		else return -1;
	}
	
	
	
	
}
