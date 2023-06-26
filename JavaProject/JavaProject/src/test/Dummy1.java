package test;
import java.util.Scanner;
public class Dummy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter no");
		int num=s.nextInt();
		int sum=0;
		int copy=num;
		int power=1;
		int count=0;
		while(num>0)
		{
			
			
			count++;
			int digit=num%10;
			num=num/10;
		}System.out.println(count);
		num=copy;
		while (num>0)
		{
		   int d=num%10;
		   power=1;
		   for(int i=1;i<=count;i++)
		   
		   {
			   power=power*d;
			   
		   }
		   sum=sum+power;
		   count--;
		   num=num/10;
		   
		}System.out.println(sum);
		if(sum==copy)
		{
			System.out.println("Disarium no");
		}
		else
		{
			System.out.println("Not Disarium");
		}
	}

}
