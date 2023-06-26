package loop030523;
import java.util.Scanner;
public class Ckeck_Prime{
	
	// check no. is prime or not
	
	
	public static void main(String args[])
	{
		
		// No. is prime or not
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no.");
		int num1= sc.nextInt();
		int i=2;
		boolean isprime=true;
		while (i<num1)
		{
			if (num1%i==0)
			{
				isprime=false;
			}
			i++;
		}
		if (isprime==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
	

}
