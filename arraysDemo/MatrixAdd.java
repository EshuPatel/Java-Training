package arraysDemo;

/**
 * Author : Eshu.Patel
 * Date : Sep 2, 2025
 * Time :11:56:55 AM
 * Project :CoreJava
*/

public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2x3 matrix
		int[][] m1= {{1,2,3},
					{4,5,6}};
		
		int [][] m2= { {7,8,9},
				{11,12,13}};
		
//		result matrix of same size
		int rows=m1.length;
		int cols= m1[0].length;
		int[][] res= new int[rows][cols];
		
//		matrix addn.
		for (int i = 0; i <rows; i++) {
			for (int j = 0; j < cols; j++) {
				res[i][j]= m1[i][j]+ m2[i][j];
			}
		}
		
		
//		display result
		System.out.println("Result****************");
		for (int i = 0; i <rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
		
		}
 	}
