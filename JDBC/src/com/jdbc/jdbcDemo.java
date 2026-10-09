package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Regeister SucessFully");
		
		
		String url  =  "jdbc:mysql://localhost:3306/jfs56";
		String uname = "root";
		String pass = "7898";
		
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		System.out.println("Database Connection SucessFully");
		
		Statement smt = con.createStatement();
		System.out.println("Statement is Created");
		
		String query  = "create table dept1 (d_id int ,d_name varchar(20))";
		smt.execute(query);
		System.out.println("table Created Sucessfully");
		
		con.close();
		smt.close();
		
	
	}

}
