package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :3:08:10 PM
 * Project :CoreJava
*/

 class Test {
	 
//	 destructor
	 public void finalize() {
		 System.out.println("Object destroyed & Garbage collected");
	 }

}
 
 
public class DestructorDemo{
	public static void main(String[] args) {
		
		Test t1= new Test();
		Test t2= new Test();
		Test t3= new Test();
		Test t4= new Test();
		
		t1=null;
		t2=null;
		t3=null;
		t4=null;
		
		System.gc(); //invoke service gc()
		
		System.out.println("In main method");
	}
}
