package oopsDemo3;

/**
 * Author : Eshu.Patel
 * Date : Sep 5, 2025
 * Time :12:05:14 PM
 * Project :CoreJava
*/
//Final class: RBI rules cannot be inherited




public final class RBI {
		// Final variable (constant)
	    public static final double MIN_HOME_LOAN_RATE = 6.5;  // cannot change

	    // Final method (standard rule - cannot be overridden by banks)
	    public final void showRBIGuidelines() {
	        System.out.println("📌 RBI Guideline: Minimum Home Loan Interest Rate = " + MIN_HOME_LOAN_RATE + "%");
	    }
}
