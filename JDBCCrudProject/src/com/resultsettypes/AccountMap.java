package com.resultsettypes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import com.crud.DBConnection;

public class AccountMap {
	
	static Connection conn=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	
	public AccountMap()
	{
		conn=DBConnection.getConn();
		try
		{
			st=conn.createStatement();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		HashMap amap = new HashMap<>();
	}
	
	
	void createMap()
	{
		try
		{
			rs=st.executeQuery("select * from accounts")
		}
	}

	public static void main(String[] args) {
		
	}

}
