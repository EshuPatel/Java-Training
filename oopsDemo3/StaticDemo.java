package oopsDemo3;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :11:31:06 AM
 * Project :CoreJava
*/

class Count{
	
	private static int cnt;
	private int a;
	
	Count(){
		cnt++;
		a=100;
	}
	
	
	//static method
	public static void display() {
		System.out.println("The number of objects created:"+ cnt);
//		a+=10;
	}
	 public void print(){
	        System.out.println("Instance Method Variable : "+a);
	        
	    }
	
	
}
public class StaticDemo {

	public static void main(String[] args) {
		Count c1= new Count();
		Count c2= new Count();
		Count c3= new Count();
		Count c4= new Count();
		
		c1.print();
		
		Count.display();
	}

}
