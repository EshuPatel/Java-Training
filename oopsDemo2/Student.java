package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 4, 2025
 * Time :11:49:46 AM
 * Project :CoreJava
*/


//stud has addr but add dont have stud
public class Student {
	int rollNo;
	String name;
	
	Address ad; //entity relnship ----aggregation-----has-a reln.
	
	
  
	 public Student(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}



	 void display()
		{
			System.out.println("---------- Student Details ------------");
			System.out.println("Student Id   :"+rollNo );
			System.out.println("Student Name :"+name);
			
			System.out.println("Address: "+ad.city+" "+ad.state+" "+ad.country+" "+
			ad.pincode);
		}
}
