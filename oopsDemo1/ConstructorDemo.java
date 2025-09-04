package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :11:50:01 AM
 * Project :CoreJava
*/

//Constructor is a special method with the same name of a class, 
//* which initializes an Object properties.
//* Same name as the class and no return type.
//* Special Method invoked whenever an instance/object of a given class is created.


public class ConstructorDemo {
	
	int id;
	String name;
	float salary;
	
	

	public ConstructorDemo() {
		System.out.println("I am implicit contructor");
		id=101;
		name="Mike";
		salary= 5000.00f;
	}

	// generate Constructor with arguments
	// Source Menu -> Generate Constructor using Fields
	// --> Select All --> Generate Button
	public ConstructorDemo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println(this.id+ "  "+ this.name+" "+ this.salary);
	}

	public static void main(String[] args) {
		
		ConstructorDemo c1= new ConstructorDemo();
		ConstructorDemo c2= new ConstructorDemo(101, "JOhn", 6000.00f);
		ConstructorDemo c3= new ConstructorDemo(102, "temma", 45000.00f);
		
//		ConstructorDemo c4= new ConstructorDemo();
//		ConstructorDemo c5= new ConstructorDemo();
		
		c1.display();
		c2.display();
		c3.display();
		
		

	}

}
