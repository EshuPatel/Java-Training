package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :10:44:08 AM
 * Project :CoreJava
*/

public class Bicycle {
	
	int gear;
	
	void applyBreak() {
		System.out.println("Applying brakes......");
	}
	
	public void startCycling() {
		gear++;
		System.out.println("Cycling in gear no."+ gear);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bicycle sb= new Bicycle();
		 sb.startCycling();
		 sb.applyBreak();
	}

}
