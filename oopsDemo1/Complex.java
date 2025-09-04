package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :12:23:30 PM
 * Project :CoreJava
*/


//Program to add 2 complex numbers- Real & Imaginary part


public class Complex {
	
	private double real;
	private double imaginary;
	

	// Generate Constructor using fields
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public void add(Complex obj) {
		this.real+= obj.real;
		this.imaginary+= obj.imaginary;
	}

	public void display()
	{
		System.out.println("r"+this.real+" + i"+this.imaginary);
	}

}
