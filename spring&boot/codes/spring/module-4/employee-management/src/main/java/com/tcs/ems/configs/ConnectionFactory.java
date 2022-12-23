package com.tcs.ems.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
	private static Connection con = null;
	
	public static Connection getDBConnection() throws Exception{
		if(con == null) {
			ResourceBundle bundle = ResourceBundle.getBundle("dbconfig");
			
			String dc = bundle.getString("jdbc.driverclass");
			String url = bundle.getString("jdbc.url") ;
			String uid = bundle.getString("jdbc.username");
			String pwd = bundle.getString("jdbc.password");
			
			Class.forName(dc); //optional from Java 8
			con = DriverManager.getConnection(url, uid, pwd);
		}
		return con;
	}
}
