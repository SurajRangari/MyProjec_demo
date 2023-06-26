package array;

import java.util.Scanner;

public class AlternateNo {
	public static void sumAlternate(int a[]) {
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			if (i%2==0)
			{
				sum=sum+a[i];
			}
		}System.out.println("Sum of alternate elements="+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array");
		int a[]=new int[5];
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		AlternateNo.sumAlternate(a);
	}

}
