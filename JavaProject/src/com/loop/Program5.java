package com.loop;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		//23
		//456
		//78910
		
		int i;
		int j;
		int num1=1;
		for (i=1;i<=4;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print(num1);
				num1++;
			}
			System.out.println();
		}

	}

}
