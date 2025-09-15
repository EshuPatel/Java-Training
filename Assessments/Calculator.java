package assessments;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :11:45:45 AM
 * Project :CoreJava
*/

public class Calculator {
	
		public static void main(String args[]){
			int num1, num2,sum, prod, sub, choice;
			float div;
			
			System.out.println("Enter 2 nos.");
			num1= Integer.parseInt(args[0]);
			num2= Integer.parseInt(args[1]);		//typecastings
			choice= Integer.parseInt(args[2]);
			
			System.out.println("Enter choice 1: addition");
			System.out.println("Enter choice2: sub");
			System.out.println("Enter choice3: mul");
			System.out.println("Enter choice4: div");
			System.out.println("Enter choice");
			
			
			switch (choice){
			case 1:
				System.out.println("Addition result"+ (num1+num2));
				break;
			case 2:
				System.out.println("Subtraction result"+ (num1-num2));
				return;
			case 3:
				System.out.println("Multiplication result"+ (num1*num2));
				return;
			case 4:
				System.out.println("Division result"+ (num1/num2));
				return;
			default:
				System.out.println("Invalid choice entry");
				return;
				
				
				 
				   
			}
		}
}

