package loop030523;
import java.util.Scanner;
public class Armstrong_No {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Check no. is Armstrong or not
		// Cond: eg:xyz
		//          (x*x*x) + (y*y*y) + (z*z*z) = xyz
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while (num>0) 
		{
			int digit=num%10;
			sum= sum+ (digit*digit*digit);
			num=num/10;
		}
		num=temp;
		if (num==sum)
		{
			System.out.println("No. is Armstrong");
		}
		else
		{
			System.out.println("No. not Armstrong");
		}
	}

}
