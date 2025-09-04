package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Author : Eshu.Patel    
 * Date : Aug 30, 2025
 * Time :10:35:31 AM
 * Project :CoreJava
 */

public class BufferReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);

		System.out.println("Name");
		String name= br.readLine();

		System.out.println("Age");
		int age= Integer.parseInt(br.readLine());

		System.out.println("Salary");
		float sal= Float.parseFloat(br.readLine());

		System.out.println("Welcome " + name + " your age= "+ age + " your salary= "+ sal);
	}

}
