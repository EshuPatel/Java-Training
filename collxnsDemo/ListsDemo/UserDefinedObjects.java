package collxnsDemo.listDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :11:38:52 AM
 * Project :CoreJava
*/


//Program to store user defined Objects in collections

public class UserDefinedObjects {

	public static void main(String[] args) {
		 //Creating Books  object & initialized using Book Constructor
		        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		        
		        //LIst of Books
		        List<Book> bList = new ArrayList<>();
		        
		        //add elems
		        bList.add(b1);  
		        bList.add(b2);
		        bList.add(b3);
		        
		        //traverse
		        System.out.println("******************Book List************");
		        for(Book i: bList)  System.out.println(i.getId()+ "\t"+ i.getName()+ 
		        		"\t"+i.getAuthor()+ "\t"+i.getPublisher()+ "\t"+i.getQuality());;
		        		
		        		System.out.println("Total no. of books : "+ bList.size());
		        
		        

	}

}
