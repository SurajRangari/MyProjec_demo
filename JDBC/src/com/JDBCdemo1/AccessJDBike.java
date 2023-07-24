package com.JDBCdemo1;

import java.sql.Connection;

public class AccessJDBike {

	public static Connection con=null;
	
	public AccessJDBike()
	{
		con=JDBikeConnection.getConn();
		System.out.println("Connection1 established...................");
	}
	public static void main(String[] args) {
		
		AccessJDBike a=new AccessJDBike();
		
	}

}
