package loop030523;
import java.util.Scanner;
public class Disarium_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Disarium no
		//xyz = x + y*y + z*z*z
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no:");
		int num= sc.nextInt();
		int copy=num;
		int sum=0;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		//System.out.println(count);
		num=copy;
		
		while(num>0)
		{
			int d=num%10;
			int power=1;
			for (int i=1;i<=count;i++)
			{
				power=power*d;
			}
			count--;
			num=num/10;
			sum=sum+power;
		}
		if (sum==copy)
		{
			System.out.println("Disarium no.");
		}
		else {
			System.out.println("Not Disarium no.");
		}
     
	}
	

}
