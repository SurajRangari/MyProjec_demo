package com.JDBCdemo1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBikeConnection {

	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/showroom";
	public static final String USER="root";
	public static final String PASS="root";
	
	static Connection con=null;
	
	public static Connection getConn()
	{
		try
		{
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver loaded.............");
			
			con=DriverManager.getConnection(JDBC_URL,USER,PASS);
			System.out.println("Connection established.............");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	public static void main(String a[])
	{
		getConn();
	}

}
