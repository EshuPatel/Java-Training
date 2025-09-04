package oopsDemo1;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :10:01:02 AM
 * Project :CoreJava
*/

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1= new Book();
		
//		setter methods
		b1.setBookId(101);
		b1.setBookName("Harry Potter");
		b1.setPrice(200);
		b1.setPublisher("Remma");
		
//		getter method
		System.out.println("***************Book Details**************");
		b1.display();
		System.out.println(b1.getBookId()+"  "+ b1.getBookName()+" "+ b1.getPrice()+ " "+ b1.getPublisher());
		
		System.out.println("Discounted Price** "+  b1.discountPrice());
		
		System.out.println(b1);
		
		
		Book b2= new Book();
		
		Scanner s = new Scanner(System.in);
		System.out.println("ENter bId, Name, Price & Publisher");
		
		b2.setBookId(s.nextInt());
		s.nextLine();
		b2.setBookName(s.next());
		b2.setPrice(s.nextFloat());
		s.nextLine();
		b2.setPublisher(s.nextLine());
		s.close();
		
		b2.display();
		
		System.out.println("*********************************************");
		System.out.println("Book Id "+ b2.getBookId());
		System.out.println("Book Name "+ b2.getBookName());
		System.out.println("Book Price "+ b2.getPrice());
		System.out.println("Book Publisher "+ b2.getPublisher());
		
		System.out.println(b2);
		
	}

}
