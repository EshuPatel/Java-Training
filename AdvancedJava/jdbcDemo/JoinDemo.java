package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Author : Eshu.Patel
 * Date : Sep 10, 2025
 * Time :4:13:05 PM
 * Project :Advanced Java
*/

public class JoinDemo {

	public static void main(String[] args) {
		Connection con=null;
		java.sql.Statement stmt;
		ResultSet rs;

		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","MyPass123");

			// Create a statement object to execute the query
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("select c.id,first_name,name from candidates c INNER JOIN  "
					+ "candidate_skills s ON c.id=candidate_id  INNER JOIN  "
					+ "skills sk ON s.skill_id=sk.id;");

			while(rs.next())  {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
				 rs.close();
			     stmt.close();
			     con.close();
		}
		 catch(Exception e){ 
				
				System.out.println(e);
				}  

		}


	}


