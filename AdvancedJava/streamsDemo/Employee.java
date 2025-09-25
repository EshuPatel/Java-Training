package streamsDemo;

/**
 * Author : Eshu.Patel
 * Date : Sep 12, 2025
 * Time :10:57:42 AM
 * Project :Advanced Java
*/

public class Employee {
	private int salary;
    private String name;
	public Employee(String name, int salary) {
		super();
		this.salary = salary;
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
