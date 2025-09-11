package jdbcDemo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Author : Eshu.Patel
 * Date : Sep 10, 2025
 * Time :3:16:12 PM
 * Project :Advanced Java
*/

public class SelectDEmo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		java.sql.Statement stmt;
		ResultSet rs;

		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection
			con=DriverManager.getConnection("jdbc:mysql://172.90.89:3306/coforgedb","root","MyPass123");

			// Create a statement object to execute the query
			stmt=con.createStatement();

			// Execute the query and get the result set
			rs=stmt.executeQuery("SELECT employee_id,first_name,last_name,dob,dept_id "
					+ "from employees order by last_name");

			// Process the result set
			while(rs.next())
			{
				// Retrieve data by column name or index
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString("last_name")+"\t"+
						rs.getDate("email")+"\t"+rs.getInt("salary"));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
