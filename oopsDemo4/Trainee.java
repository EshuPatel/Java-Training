package oopsDemo4;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :12:50:21 PM
 * Project :CoreJava
*/

public abstract class Trainee {
	 private String name;
	   private String address;
	   private int number;
   
   
   public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}


   //abstract method declaration - must be overridden in the derived class
   public abstract double calcMarks();
   
   
   void show()
	{
		System.out.println("Display Marks for :" +this.name+ " "+this.address);
	}


   @Override
   public String toString() {
	return "Trainee[ name=" + name+ "\taddress="+ address+ "\tnumber= "+ number;
   }
   
   
}
