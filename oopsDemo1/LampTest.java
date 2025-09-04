package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :10:33:25 AM
 * Project :CoreJava
*/


//Java Program to implement instance class & main class in a Single file  
  

class Lamp{
	
	
	//stores the value for light
	// true if light is on
	// false if light is off
	boolean isOn;
	
	//method to turn On the light
	void turnOn(){
		isOn=true;
		System.out.println("Light On???"+ isOn);
	}


	//method to turn Off the light
	void turnOff() {
		isOn=false;
		System.out.println("Light On???"+ isOn);
	}
}

public class LampTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lamp led= new Lamp();
		
		Lamp cfc = new Lamp();
		
		led.turnOn();
		cfc.turnOn();
		
		led.turnOff();
		cfc.turnOff();
		
	}

}
