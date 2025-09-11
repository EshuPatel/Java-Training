package oopsDemo4;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :12:53:54 PM
 * Project :CoreJava
*/

public class Marks extends Trainee {
	
	private double marks;

	public Marks(String name, String address, int number, double marks) {
		super(name, address, number);
		this.marks = marks;
	}

	@Override
	public double calcMarks() {
		System.out.println("Calculate marks");
		return marks*2;
	}

	

}
