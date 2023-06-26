package labsession;
import java.util.Scanner;
public class HarshadNo {
	public static void main(String args[])
	{
		//Harshad no
		// Any no which whose sum of digits divisible to that no.
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no.");
		int num= sc.nextInt();
		int copy=num;
		int sum=0;
		int digit;
		while (num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		if (copy%sum==0)
		{
			System.out.println("Harshad no.");
		}
		else
		{
			System.out.println("Not Harshad no.");
		}
	}

}
