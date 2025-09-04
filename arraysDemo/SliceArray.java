package arraysDemo;

import java.util.Arrays;

/**
 * Author : Eshu.Patel
 * Date : Sep 2, 2025
 * Time :11:28:58 AM
 * Project :CoreJava
*/

public class SliceArray {
	
//	/user defined functions
	static void display() {
		System.out.println("Array Manipulation");
	}
	
	
	static void sliceArr(int[] marks, int strt, int end) {
		int sliceMrks[]= new int[end-strt];
		for (int i = 0; i < sliceMrks.length; i++) {
			sliceMrks[i]= marks[strt+i];
		}
		System.out.println("Sliced Array From "+ strt + " to "+ (end-1)+ "is "+ Arrays.toString(sliceMrks));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display();
		
		int[] marks={78,56,23,44,90,98,67,55,35,84};
        int start=2,end=6;

        System.out.println("Original Array : "+ Arrays.toString(marks));
        sliceArr(marks,start,end+1); // Invoke sliceArray() method

        int [] grades={99,44,31,78,49,55,39,21,30,92,66,44};
        int start1=4,end1=8;
        System.out.println("Original Array : "+ Arrays.toString(grades));
        sliceArr(grades,start1,end1+1); // Invoke sliceArray() method again - reusability

        //Use inbuilt method copyOfRange() to slice Array
        int[] sliceGrades=Arrays.copyOfRange(grades,8,11);
        System.out.println("Original Array : "+ Arrays.toString(sliceGrades));
	}

}
