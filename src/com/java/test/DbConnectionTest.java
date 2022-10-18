package com.java.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionTest {

	public static void main(String[] args) {
	      String MySQLURL = "jdbc:mysql://localhost:3306/v1_schema";
	      String databseUserName = "root";
	      String databasePassword = "root";
	      Connection con = null;
	      try {
	         con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
	         if (con != null) {
	            System.out.println("Database connection is successful !!!!");
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	}

