package oopsDemo3;

/**
 * Author : Eshu.Patel
 * Date : Sep 4, 2025
 * Time :3:15:29 PM
 * Project :CoreJava
 * 
 * 
 * Overriding is a feature that allows a subclass or
 * child class to provide a specific implementation of a method
 * that is already provided by one of its super-classes or parent classes.
 * 
*/
class Bank{

	 private String name;

	 public Bank(String name) {
		this.name = name;
	 }
	 
	 int getRateOfInterest(){
	        return 0;
	    }
	    void display(){
	        System.out.println("***********Welcome to "+name+" Bank*********** ");
	    }
}







class SBI extends Bank{

	public SBI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 5;
	}
}





class ICICI extends Bank{

	public ICICI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 7;
	}
}






class Axis extends Bank{

	public Axis(String name) {
		super(name);}

	@Override
	int getRateOfInterest() {
		return 6;
	}
}








public class OverrideDemo {
	public static void main(String[] args) {
		
		SBI s1= new SBI("SBI");
		ICICI i1= new ICICI("ICICI");
		Axis a1= new Axis("Axis");
		
		s1.display();
		System.out.println("Interest Rate of SBI:    "+ s1.getRateOfInterest());
		
		i1.display();
		System.out.println("Interest Rate of ICICI:    "+ i1.getRateOfInterest());
		
		a1.display();
		System.out.println("Interest Rate of Axis:    "+ a1.getRateOfInterest());
	}

}
