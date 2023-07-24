package com.JDBCdemo;

import java.sql.Connection;

public class AccessDB {

	
		public static Connection con=null;
		public AccessDB()
		{
			con=JDConnections.getConn();
			System.out.println("Connection established....................");
		}
		
		public static void main(String a[])
		{
			AccessDB obj=new AccessDB();
		}
	

}
