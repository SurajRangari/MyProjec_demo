package com.factorymethod;

import java.util.Arrays;

public class PYthonDeveloper implements Developer {
	
	@Override 
	public void salaryPaid()
	{
		System.out.println("Salary is:Rs"+60000);
	}
	
	@Override
	public void skills()
	{
		String arr[]= {"Python","My SQL","HTML","Angular","Spring boot"};
		
		System.out.println(Arrays.toString(arr));
	}


}
