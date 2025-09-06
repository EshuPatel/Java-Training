package oopsDemo3;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :11:43:41 AM
 * Project :CoreJava
*/

public class StaticDremo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Invoke static Method even before creating Object
        Student.collegeChange();

        Student s1=new Student(101,"Mike");
        Student s2=new Student(102,"John");
        Student s3=new Student(103,"Mary");

        s1.display();
        s2.display();
        s3.display();

	}

}
