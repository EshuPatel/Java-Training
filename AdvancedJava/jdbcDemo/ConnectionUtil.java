package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Author : Eshu.Patel
 * Date : Sep 11, 2025
 * Time :9:40:48 AM
 * Project :Advanced Java
*/

//utility class for creating connxn for MySql db
public class ConnectionUtil {

	public static Connection createConnection() throws Exception{
		
		//step:1 load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("MySql loaded sucessfully");
		
		
		//establish connxn
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root", "MyPass123");
		System.out.println("connection success");
		return con;
	}
	
	
	

}
