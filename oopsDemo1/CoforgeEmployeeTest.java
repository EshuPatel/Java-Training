package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 2, 2025
 * Time :4:42:16 PM
 * Project :CoreJava
*/

public class CoforgeEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee dev= new Employee();
		Employee tstr= new Employee();
		Employee sales= new Employee();
		
		System.out.println("****************Coforge************* ");
		
		dev.inputEmployeeDetails();
		dev.calculateNetSalary();
		dev.displayEmployeeDetails();
				
		tstr.inputEmployeeDetails();
		tstr.calculateNetSalary();
		tstr.displayEmployeeDetails();
		
		sales.inputEmployeeDetails();
		sales.calculateNetSalary();
		sales.displayEmployeeDetails();
	}

}
