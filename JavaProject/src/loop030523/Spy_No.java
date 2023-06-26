package loop030523;
import java.util.Scanner;
public class Spy_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//spy or not
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no.");
		int num= sc.nextInt();
		int sum=0;
		int prod=1;
		while (num>0)
		{
			int digit=num%10;
			sum = sum+digit;
			prod = prod*digit;
			num=num/10;
		}
		if (sum==prod)
		{
			System.out.println("No. is spy");
		}
		else
		{
			System.out.println("No. isn't spy");
		}
	}

}
