package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("register");
		
		String url = "jdbc:mysql://localhost;3306/db";
		String uname = "root";
		String pass = "7898";
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection");
		
		Statement smt = con.createStatement();
		System.out.println("Statement");
		
		String query  = "create table dept (d_id int ,d_name varchar(20))";
		smt.execute(query);
		System.out.println("table Created");
		
		con.close();
		smt.close();
		
	}

}
