package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :4:21:37 PM
 * Project :CoreJava
*/


//child class- Inheritance -is a relationship
public class Developer extends Employee{

	private String skillSet, projectName;
	
	public Developer(int empId, String name, String skillSet, String projectName) {
		super(empId, name); //invokes parent class constructor
		this.skillSet = skillSet;
		this.projectName = projectName;
	}

	// method to display developer details
	public void displayDeveloperDetails() {
		// call parent class method

		System.out.println("Skill Set: " + skillSet);
		System.out.println("Project Name: " + projectName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
