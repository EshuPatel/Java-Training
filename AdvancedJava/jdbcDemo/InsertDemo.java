package jdbcDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author : Eshu.Patel
 * Date : Sep 11, 2025
 * Time :9:47:19 AM
 * Project :Advanced Java
*/

public class InsertDemo {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		int count;
		
		try{
			con= ConnectionUtil.createConnection();
			
			String str= "Insert into skills(name) Values('Python')";
			
			stmt =con.createStatement();
			
			count= stmt.executeUpdate(str);
			
			if(count>0) {
				System.out.println("Record Inserted Successfully");
			}
			
			//count total no. of records in table
			String str1= "Select Count(id) from Skills";
			rs=stmt.executeQuery(str1);
			int cnt=0;
			while(rs.next())    cnt= rs.getInt(1);
			System.out.println("Total no. of records is:  "+ cnt);
			
		}
		
		catch(Exception e){
			System.out.println(e);
		}
    
    
	}

}
