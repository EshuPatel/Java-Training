package jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Author : Eshu.Patel
 * Date : Sep 11, 2025
 * Time :11:22:41 AM
 * Project :Advanced Java
*/

public class UpdateDemo {
	public static void main(String[] args) {
		Candidates c= new Candidates();
		
		System.out.println("***********Update Candidate Details************");
		try {
			c.getConnection();
			c.UpdateCandidate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
