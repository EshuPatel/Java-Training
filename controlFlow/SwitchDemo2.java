package controlFlow;

import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 1, 2025
 * Time :12:07:46 PM
 * Project :CoreJava
*/

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,result;
        String operator;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter 2 Numbers :");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        System.out.println("Enter Arithmetic Operator");
        operator=scanner.next();
        scanner.close();

        switch (operator){
            case "+":   result=num1+num2;
                        System.out.println("The Addition is : "+result);
                        break;
            case "-":   result=num1-num2;
                        System.out.println("The Subtraction is : "+result);
                        break;
            case "*":   result=num1*num2;
                        System.out.println("The Multiplication is : "+result);
                        break;
            case "/":   result=num1/num2;
                        System.out.println("The Division is : "+result);
                        break;
            default:
            			System.out.println("Invalid operator ");
            			break;
	}

}
}
