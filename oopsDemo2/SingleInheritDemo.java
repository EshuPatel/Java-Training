package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :4:30:33 PM
 * Project :CoreJava
*/

public class SingleInheritDemo {
	public static void main(String[] args) {
		
		//create objects of child class
		Developer d1= new Developer(11, "rea", "Java", "Emp M/g");
		Developer d2= new Developer(12, "Tia", ".net", "AppDev");
		
		d1.display();
		d1.displayDeveloperDetails();
		
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee e1= new Employee(13, "Nik");
		e1.display();
	}
}
