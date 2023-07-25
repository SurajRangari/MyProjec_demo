package com.factorymethod;

import java.util.Arrays;

public class FullStackDeveloper implements Developer {
	
	@Override 
	public void salaryPaid()
	{
		System.out.println("Salary is:Rs"+80000);
	}
	
	@Override
	public void skills()
	{
		String arr[]= {"Java Script","My SQL","HTML","Angular","Spring boot"};
		
		System.out.println(Arrays.toString(arr));
	}

}
