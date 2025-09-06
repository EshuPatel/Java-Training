package oopsDemo3;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :12:10:15 PM
 * Project :CoreJava
*/

public class HomeLoanFinalDemo {
//	using rbi rules
	RBI rb= new RBI();
	rb.showRBIGuidelines();
	
//	Creating customer home loans
	HomeLoan hl= new HomeLoan("Alice", 300, 100000);
	HomeLoan h2= new HomeLoan("Alice", 300, 100000);
	
	h1.showRBIGuidelines();
	h2.showRBIGuidelines();
			
			
			
			
			
			
			
	// ❌ ERROR if you try to modify final variable
    // RBI.MIN_HOME_LOAN_RATE = 7.0;  // Not allowed
    // loan1.PROCESSING_FEE = 20000;  // Not allowed
}
