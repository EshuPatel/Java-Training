package oopsDemo3;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :9:47:51 AM
 * Project :CoreJava
*/

public class UpcastingDemo {

	public static void main(String[] args) {
		
		Product product;
		
//		product refers to Book Obj
		product = new Book("Java Prgmming", 450, "James Gosling");
		System.out.println("------------Book Details---------");
		product.display();
		
		 //Switching from one implementation to another is easy
        product=new Laptop("IdeaPad",60000.00,"Lenova"); //Upcasting
        System.out.println("------------- Laptop Details --------------");
        product.display();//Dynamic Binding

        product =new Book("Python Made Easy",650,"Balaguruswamy"); //Upcasting
        System.out.println("------------- Book Details --------------");
        product.display(); //Dynamic Binding
        
        //Access default variable from Test class
        Test t1=new Test(100,200,45,600);
        Test2 t=new Test2(150,250,450,650);
        System.out.println("Default variable form Test Class : "+t1.a);
        t.print(); //from test2 clss `	

	}

}
