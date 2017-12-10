package com.qhit.sbm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	private static Connection con;
	private static final String DRIVERNAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=db_sbm";
	private static final String userName = "sa";
	private static final String password = "123456";
	
	public static Connection getConnection(){
		
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(url,userName,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	public static void close(Statement statement,Connection con){
		try {
			statement.cancel();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
