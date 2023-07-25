package com.factorymethod;

public class GetDeveloper {
	
	public Developer getDeveloper(String arr)
	{
		if(arr==null)
		{
			return null;
		}
		else if(arr.equalsIgnoreCase("java"))
		{
			return new JavaDeveloper();
		}
		else if(arr.equalsIgnoreCase("full stack"))
		{
			return new FullStackDeveloper();
		}
		else if(arr.equalsIgnoreCase("python"))
		{
			return new PYthonDeveloper();
		}
		else
		{
			return null;
		}
	}

}
