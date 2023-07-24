package com.JDBCdemo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.JDBCdemo.JDConnections;

public class FetchModelData {
	static Connection conn=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	
	public  FetchModelData() throws SQLException
	{
		conn=JDBikeConnection.getConn();
		System.out.println("Connection Done......................");
		st=conn.createStatement();
	}
	
	public void fetchData()
	{
		try
		{
			
			pst=conn.prepareStatement("Select * from model where cost>?");
			pst.setDouble(1, 90000);
			System.out.println("...........Account Data...............");
			
			rs=pst.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Model id:"+rs.getInt(1));
				System.out.println("Model name:"+rs.getString(2));
				System.out.println("Cost:"+rs.getDouble(3));
				System.out.println("..................................");
			}
			System.out.println("............................");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
}



	public static void main(String[] args) throws SQLException {
		
		FetchModelData f=new FetchModelData();
		//f.fetchData();
		f.fetchData();
		
	}
}