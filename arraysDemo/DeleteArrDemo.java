package arraysDemo;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 2, 2025
 * Time :10:49:18 AM
 * Project :CoreJava
*/

public class DeleteArrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks={78,56,23,44,90,98,67,55,35,84};//declare & initialise Array
        Scanner scanner=new Scanner(System.in);

        System.out.println("************** Array of Marks *****************");
        for (int i = 0; i <marks.length ; i++) {
            System.out.print(marks[i]+"\t");
        }
        System.out.println();
        
        boolean isFound=false;

        System.out.println("Enter element to be Deleted :");
        int element=scanner.nextInt();
        //Delete Logic
        for (int i = 0; i <marks.length ; i++) {
            if(marks[i]==element){
            	
            	isFound=true;
                //Shift the elements in array
                for (int j = i; j <marks.length-1 ; j++) {
                    marks[j]=marks[j+1];
                }
               
                break;
            }
                    }
        
        
        if(isFound) {
        	System.out.println("Array After Deletion:");
            for (int i = 0; i < marks.length-1; i++) {
                System.out.print(marks[i]+"\t");
        }}
       else {
            	System.out.println(".........Error 404: Not found..........");
            }
        
        scanner.close();
        
        }
	}


