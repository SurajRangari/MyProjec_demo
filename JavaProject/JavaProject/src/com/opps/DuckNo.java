package com.opps;
import java.util.Scanner;
public class DuckNo {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int num=sc.nextInt();
		int count=0;
		while (num>0)
		{
			int digit=num%10;
			if  (digit==0)
			{
				count++;
			}
			
			
		}if (count==1)
		{
			
		}
	}

}
