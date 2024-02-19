package com.jbk.entity;

import java.sql.Statement;
import java.sql.*;
public class InsertQeury {

	public static void main(String[] args) {
		
		 Connection con=null;
		// step 1st load the driver 
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step second JDBC Connection
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/record","root","Rushee@2002");
			
		// step three create JDBC STATEMENT
		Statement stmt=	con.createStatement();
		
		// excute QUERY
		
	int Status=stmt.executeUpdate("insert into student (fname, lname) values ('Kshitiz','Kale')");
		if(Status >0) {
			System.out.println("Record Inserted");
			
		}
		else {
			System.out.println("not");
		}
		}
		catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
			catch(Exception e) {
				e.printStackTrace();				
			}
		finally {
			
			try {
				
				//  step 5 close Connection
				con.close();
				
			}
			catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
