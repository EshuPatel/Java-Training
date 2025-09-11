package mapsDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :3:32:50 PM
 * Project :CoreJava
*/

public class Company {
	private HashMap<Manager, List<Employee>> managerEmployeeMap;

	public Company() {
		this.managerEmployeeMap = new HashMap<>();
	}
	
	  // Add manager with an empty employee list
    public void addManager(Manager manager) {
        managerEmployeeMap.putIfAbsent(manager, new ArrayList<>());
    }
        

        
    
    // Assign employee to a manager
    public void addEmployeeToManager(Manager manager, Employee employee) {
    	// If manager not present in map, add an empty list first
        if (!managerEmployeeMap.containsKey(manager)) {
            managerEmployeeMap.put(manager, new ArrayList<Employee>());
        }
     // Add employee to the manager's list
        managerEmployeeMap.get(manager).add(employee);
    }

    // Display managers and their employees with better formatting
    public void showAllManagersAndEmployees() {
        System.out.println("\n========== COFORGE COMPANY MANAGER-EMPLOYEE DIRECTORY ==========\n");

        for (Map.Entry<Manager, List<Employee>> entry : managerEmployeeMap.entrySet()) {
            Manager manager = entry.getKey();
            List<Employee> employees = entry.getValue();

            manager.display();
            System.out.println("   Employees Managed:");
            System.out.println("   -----------------------------------------------");

            for (Employee emp : employees) {
                emp.display();
            }

            System.out.println("   -----------------------------------------------\n");
        }

        System.out.println("========================================================\n");
    }
	
	
}
