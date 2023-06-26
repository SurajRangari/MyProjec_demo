package com.loop;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DCBA
		//DCB
		//DC
		//D
		
		for (char i='A';i<='D';i++)   //row
		{
			for (char j='D';j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
