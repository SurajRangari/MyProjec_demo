package com.resultSet11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import com.crud.DBConnection;



public class MapData {
	
	static Connection conn=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	
	HashMap<Integer,String> map=new HashMap<>();
	public MapData()
	{
		conn=DBConnection.getConn();
		try
		{
			st=conn.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	void createMap()
	{
		try
		{
		rs=st.executeQuery("select p.purchase_id,c.cust_id,p.model_id1,p.booking_amount,p.payment_id1,p.purchase_date,p.rating_id1from model m join purchase p on m.model_id=p.model_id1join customer c on c.cust_id=p.cust_id1");
		while(rs.next())
		{
			String values=rs.getInt(2)+"  "+rs.getInt(3)+"   "+rs.getInt(4)+"   "+rs.getInt(5)+"  "+rs.getString(6)+"   "+rs.getInt(7);
			map.put(rs.getInt(1), values);
		}
		System.out.println(map);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String args[])
	{
		MapData m=new MapData();
		m.createMap();
	}

}
