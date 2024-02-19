package com.jbk.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetchAllData {

	public static void main(String[] args)  throws SQLException{
		// TODO Auto-generated method stub

		Connection con=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/record", "root","Rushee@2002");
		
		   Statement stm=con.createStatement();
		
		   ResultSet ststus=stm.executeQuery("select * from student");
		
		   while(ststus.next()) {
			   
			  int id= ststus.getInt("id");
			 String fname=ststus.getString("fname");
			 String lname=ststus.getString("fname");
			   
			System.out.println(id+fname+lname);
		   }
		  
		
		}
		catch(ClassNotFoundException e1) {
			e1.printStackTrace();
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}

}
