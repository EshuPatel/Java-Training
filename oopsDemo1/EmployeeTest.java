package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 2, 2025
 * Time :4:42:16 PM
 * Project :CoreJava
*/

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		Employee e2= new Employee();
		Employee e3= new Employee();
		
		e1.inputEmployeeDetails();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails();
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();
		
		e3.inputEmployeeDetails();
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();
	}

}
