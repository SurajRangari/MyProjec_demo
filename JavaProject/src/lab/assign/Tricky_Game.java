package lab.assign;
import java.util.*;
public class Tricky_Game {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size array");
	int n=sc.nextInt();
	int ar[]=new int[n];
	if (n<=0)
	{
		System.out.println("Array size should be greater than 0");
		
	}
	if (n>0)
	{
		System.out.println("Enter the elements:");
		for (int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		System.out.println("...........................");
		int e=n/2;
		for (int i=0;i<ar.length;i++)
		{
			for (int j=i+1;j<ar.length;j++)
			{
				if (ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
			if(e%2==0)
			{
			if (i<=e)
			 {
			System.out.println(ar[i]);
			 }
			}
			else
			{
				if (i<e)
				{
					System.out.println(ar[i]);
				}
			}
		}
		
		
		for (int i=0;i<ar.length;i++)
		{
			for (int j=i+1;j<ar.length;j++)
			{
				if (ar[i]<ar[j])
				{
					int copy=ar[i];
					ar[i]=ar[j];
					ar[j]=copy;
					
				}
			}
			if (i<e)
			{
			System.out.println(ar[i]);
			}
		}
		
		
	}
		
	}

}
