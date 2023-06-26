package array;
import java.util.Arrays;
import java.util.Scanner;
public class SumOfPrimeElement {
	public static void sumPrime(int n[]) {
		int sum=0;
	   for(int i=0;i<n.length;i++)
	   {
		   int a=n[i];
		   boolean isprime=true;
		  for(int j=2;j<a;j++)
		  {
			  if(a%j==0)
			  {
				  isprime=false;
				  break;
			  }
		  }
		  if(isprime)
		  {
			  System.out.println(n[i]);
			  sum=sum+a;
		  }
	   }System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array");
		int a[]=new int[5];
		
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		SumOfPrimeElement.sumPrime(a);
		
	}

}
