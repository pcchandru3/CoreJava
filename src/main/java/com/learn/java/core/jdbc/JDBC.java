package com.learn.java.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	
	
	public static void main(String[] args){
		
		
		Connection conn=null;
		String dbURL = "";
		String sUserName ="";
		String sPassword = "";
		
		
		try {
			
			//Step1 : Register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Step2 : Get Connection
			conn = DriverManager.getConnection(dbURL, sUserName, sPassword);
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
