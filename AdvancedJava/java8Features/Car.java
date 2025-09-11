package java8Features;

/**
 * Author : Eshu.Patel
 * Date : Sep 11, 2025
 * Time :3:40:05 PM
 * Project :Advanced Java
*/

public class Car implements Vehicle {
	private String brand;

	public Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Speeding";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "Slowing down";
	}
	
	
	
	

}
