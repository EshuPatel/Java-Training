package oopsDemo4;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :4:19:28 PM
 * Project :CoreJava
 */

public class Nurse extends HospitalStaff {
	private int patientLoad;


	public Nurse(String name, String id, String department, int patientLoad) {
		super(name, id, department);
		this.patientLoad = patientLoad;
	}


	@Override
	public void performDuties() {
		System.out.println(getName() + " is caring for " + patientLoad + 
				" patients in the " + getDepartment() + " department.");
	}
	
	


	public void administerMedication() {
		System.out.println(getName() + " is administering for mediii");
		
	}

}

