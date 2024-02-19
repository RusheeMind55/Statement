package com.jbk.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
			
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/record", "root", "Rushee@2002");
			
		
			Statement stmt=con.createStatement();
			
		int status=	stmt.executeUpdate("DELETE FROM student WHERE id=6");
			
		if(status>0) {
			System.out.println("deleted from data");
			
		}
		else {
			System.out.println("not deleted");
		}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		
		
	}

}
