package oopsDemo4;

/**
 * Author : Eshu.Patel
 * Date : Sep 6, 2025
 * Time :9:52:37 AM
 * Project :CoreJava
*/

public class Circle implements Shape {
	private double radius;

//	constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}

	@Override
	public double getArea() {
		return Math.PI* this.radius* this.radius;
	}
	
//	getters
	public double getRadius() {
		return radius;
	}
	
	

}
