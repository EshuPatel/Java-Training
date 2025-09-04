package oopsDemo1;

/**
 * Author : Eshu.Patel
 * Date : Sep 3, 2025
 * Time :12:17:10 PM
 * Project :CoreJava
*/

public class CandidateTest {
	public static void main(String[] args) {
		
//		invoke 
		Candidate c1 = new Candidate(10, "James", 3000.00f);
		
		Candidate c2 = new Candidate(101, "Jamie", 36700.00f);
		
		
		c1.calDA();
		c1.display();
		
		c2.calDA();
		c2.display();
	}
}
