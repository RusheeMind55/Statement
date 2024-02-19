package com.jbk.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatement {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con=null;
		// Step 1st load and Register driver class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// step 2nd get jdbc connection
			
		
	con =DriverManager.getConnection("jdbc:mysql://localhost:3306/record","root", "Rushee@2002");
		
		// step 3rd crete jdbc stament
	
	Statement stm=con.createStatement();
	
		// step 4th  ExcuteQuery
	
    int status= stm.executeUpdate("update  student set lname='kharde' where id=3");
  
    if(status>0) 
    {
    	System.out.println("Record Update");
    }else {
    	System.out.println("not updated");
    }
		}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
		finally {
			con.close();
		}

	}

}
