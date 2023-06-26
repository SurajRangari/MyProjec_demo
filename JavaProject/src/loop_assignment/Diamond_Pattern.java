package loop_assignment;

import java.util.Scanner;

public class Diamond_Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter rows");
		int n=sc.nextInt();
	  for (int i=1;i<=n;i++)
	  {
		  int count=0;
		  for (int j=n;j>i;j--)
		  {
			  System.out.print(" ");
		  }
		  for (int j=1;j<=i*2-1;j++)
		  {
			  System.out.print("*");
		  }
		count++;  
		 System.out.println();
	  }
	   for (int i=1;i<=n-1;i++)
	   {
		   for (int j=1;j<=i;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int j=2*(n-1-i)+1;j>=1;j--)
		   {
			   System.out.print("*");
		   }
	   System.out.println();
	   }

	}

}
