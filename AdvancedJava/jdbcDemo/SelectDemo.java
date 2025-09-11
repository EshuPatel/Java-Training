package jdbcDemo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Author : Eshu.Patel
 * Date : Sep 10, 2025
 * Time :2:34:09 PM
 * Project :Advanced Java
*/

public class SelectDemo {
	private static final String URL= "jdbc:mysql://localhost:3306/classicmodels";
	private static final String USER= "root";
	private static final String PASSWORD= "MyPass123";
	
	public static void main(String[] args) {
		Connection conn=null;
		java.sql.Statement stmt = null;
		ResultSet rs= null;
		
		
		try {
			//step:1 load mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySql loaded sucessfully");
			
			
			//establish connxn
			conn= DriverManager.getConnection(URL,USER, PASSWORD);
			System.out.println("connection success");
			
			//create statement
			stmt= conn.createStatement();
			
			//execute query
			String sql= "SELECT customerNumber, customerName, city, creditLimit from customers";
			rs= stmt.executeQuery(sql);
			
			System.out.println("*************Customer Records*************");
			
			//process resultset
			while(rs.next()) {
				int id= rs.getInt("customerNumber");
				String name= rs.getString("customerName");
				String city= rs.getString(3);
				double credit= rs.getDouble(4);
				
				System.out.printf("customerNumber:  %d  | customerName:  %s  | city:  %s  | creditLimit:  %.2f%n", id, name, city, credit);
				
				
			}
			
		}
		
		catch(Exception e){
			System.out.println("Data operation failed");
			e.printStackTrace();
			
		}
		
		finally {
			//close resources
			try {
				if(rs!=null) rs.close(); if(stmt!=null) stmt.close();   if(conn!=null) conn.close();	
			}
			catch(Exception e ) {
				e.printStackTrace();
			}
			System.out.println("Resources Closed");
		}
		
		
	}

}
