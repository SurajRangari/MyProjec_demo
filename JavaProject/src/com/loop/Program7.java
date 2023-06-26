package com.loop;
import java.util.Scanner;
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// table of given no.
		
		int num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no.");
		int num1= sc.nextInt();
		for (int i=1;i<=10;i++)
		{
			num2=num1*i;
			System.out.println(num2);
		}
	}

}
