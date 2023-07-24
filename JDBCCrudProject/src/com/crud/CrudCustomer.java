package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudCustomer {
	
	static Connection con=null;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	
	static Scanner sc=new Scanner(System.in);
	
	public CrudCustomer()
	{
		con=DBConnection.getConn();
		try
		{
			st=con.createStatement();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	void menu()
	{
		System.out.println("1. Add Customer");
		System.out.println("2. Delect a customer");
		System.out.println("3. Update phone no. of customer");
		System.out.println("4. Display all customers");
		System.out.println("5. Display customer by id");
		System.out.println("6. Exit");
		System.out.println("Enter your choice");
	}
	public void updateCustomerNo()
	{
		System.out.println("Enter id you want to updates:");
		int id=sc.nextInt();
		
		if(displayCustomerById(id))
		{
		   System.out.println(".................................");
		   System.out.println("Enter phone no:");
		   String no=sc.next();
		   
		   try
		   {
			   pst=con.prepareStatement("update customer_master set contact=? where cust_id=?");
			   pst.setString(1, no);
			   pst.setInt(2, id);
			   
			   int noOfRowsUpdated=pst.executeUpdate();
			   if(noOfRowsUpdated>0)
			   {
				   System.out.println("...............Updates values are............");
				   displayCustomerById(id);
			   }
			   else
			   {
				   System.out.println("No updation done.......................");
			   }
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }
		}
		else
		{
			System.out.println("No Customer with this id exists............");
		}
	}
	public boolean displayCustomerById(int id)
	{
		boolean status=false;
		try
		{
			pst=con.prepareStatement("select * from customer_master where cust_id=?");
			pst.setInt(1, id);
			rs=pst.executeQuery();
			
			while(rs.next())
			{
				System.out.println(".............Customer Details are...............");
				System.out.println("Customer id:"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("Phone no:"+rs.getString(3));
				System.out.println("Age:"+rs.getInt(4));
				System.out.println("Pan no:"+rs.getString(5));
				status=true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	public void delectCustomer()
	{
		System.out.println("Enter the id of customer to be delected");
		int id=sc.nextInt();
		
		try
		{
			pst=con.prepareStatement("delect from customer_master where cust_id=?");
			pst.setInt(1, id);
			
			int noOfRowsDelected=pst.executeUpdate();
			if(noOfRowsDelected>0)
			{
				System.out.println("Customer is delected............");
			}
			else
			{
				System.out.println("No customer with this id found..............");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void addCustomer()
	{
		System.out.println("Enter the customer id:");
		int id=sc.nextInt();
		System.out.println("Enter the Customer name:");
		String name=sc.next();
		System.out.println("Enter phone no:");
		String no=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter pan no:");
		String pan=sc.next();
		
		try
		{
			pst=con.prepareStatement("insert into costomer_master values(?,?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, no);
			pst.setInt(4, age);
			pst.setString(5, pan);
			
			int noOfRowsAffected=pst.executeUpdate();
			if(noOfRowsAffected>0)
			{
				System.out.println("Customer has been added........");
			}
			else
			{
				System.out.println("No customer added........");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		

	}

}
