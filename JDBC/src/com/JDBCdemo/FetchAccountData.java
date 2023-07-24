package com.JDBCdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAccountData {

	static Connection conn=null;
	Statement st;
	ResultSet rs;
	
	public  FetchAccountData() throws SQLException
	{
		conn=JDConnections.getConn();
		System.out.println("Connection Done......................");
		st=conn.createStatement();
	}
	
	public void fetchData(int id)
	{
		try
		{
			
			rs=st.executeQuery("Select * from bank where bank_id='"+id+"'");
			System.out.println("...........Account Data...............");
			System.out.println("..................................");
			System.out.println("Bankid   |    BankName    |    Address   |     City    |     State  ");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"      "+rs.getString(3)+"      "+rs.getString(4)+"     "+rs.getString(5));
				
			}
			System.out.println("............................");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws SQLException {
		FetchAccountData d=new FetchAccountData();
		int a=2;
		d.fetchData(a);
		
		

	}

}
