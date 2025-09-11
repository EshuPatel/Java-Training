package java8Features;

/**
 * Author : Eshu.Patel
 * Date : Sep 11, 2025
 * Time :3:35:57 PM
 * Project :Advanced Java
*/

public interface Vehicle {
	//by default all are abstract methods
		String getBrand();
		String speedUp();
		String slowDown();
		
		// Any non-abstract methods must be made default to add any new feature
		default String turnAlarmOn()
		{
			return "Turning the Vehicle Alarm ON.";
		}
		
		default String turnAlarmOff()
		{
			return "Turning the Vehicle Alarm OFF.";
		}
		
		static int getHorsePower(int rpm,int torque)
		{
			return (rpm*torque)/5252;
		}
}
