package com.mi.pprank.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class DConnection {
	public static String drivername = "com.mysql.jdbc.Driver";
	public static String dburl = "jdbc:mysql://localhost/pprank";
	public static String db_pass = "admin";
	public static String db_username = "root";
	static Connection con = null;

	public static Connection getConnection() {
		try {
			Class.forName(drivername);
			con = DriverManager.getConnection(dburl, db_username, db_pass);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("database connection error");
		}

		return con;

	}

	public static void main(String args[]) {
		try {
			con = DConnection.getConnection();
		} catch (Exception e) {
		}

		if (con != null) {
			System.out.println("Connection successful");
		} else {
			System.out.println("Connection not successful");
		}

	}
	public static Statement stmt(){
		try{
			Statement stmt=DConnection.getConnection().createStatement();
			return stmt;
		}catch(Exception e){
			System.out.println(e);
			return null;
		}
	}
	
}

