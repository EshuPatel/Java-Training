package oopsDemo2;

/**
 * Author : Eshu.Patel
 * Date : Sep 4, 2025
 * Time :9:54:49 AM
 * Project :CoreJava
*/

public class AccDetails extends SavingsBank{
	 //child class of Savings Bank
	 
	 int withdrawl,deposit,finalBalance;

	 public AccDetails(int accNo, String name, int min_bal, int balance, int withdrawl, int deposit) {
		super(accNo, name, min_bal, balance);
		this.withdrawl = withdrawl;
		this.deposit = deposit;
		
	 }

	
	 void display() {
		 super.display();
		 System.out.println("DEposit:"+ deposit);
		 System.out.println("Final Balance"+ finalBalance);
	 }

	 
	 
	 
}
