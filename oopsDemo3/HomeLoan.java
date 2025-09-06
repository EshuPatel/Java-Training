package oopsDemo3;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :12:07:34 PM
 * Project :CoreJava
*/

public class HomeLoan extends RBI {
	private String customerName;
    private double loanAmount;
    private final double PROCESSING_FEE;  // final variable (unique per customer, must be initialized once)





 public HomeLoan(String customerName, double loanAmount, double pROCESSING_FEE) {
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		PROCESSING_FEE = pROCESSING_FEE;
	}



 public void showLoanDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Processing Fee: " + PROCESSING_FEE);
    }

}
