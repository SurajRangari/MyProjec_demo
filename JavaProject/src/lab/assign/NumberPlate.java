package lab.assign;
import java.util.Scanner;
public class NumberPlate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter car no.");
		int num=sc.nextInt();
		int count=0;
		int p=num;
		int sum=0;
		while(num>0)
		{
			count++;
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}if (count==4)
		{
		    if (sum%3==0 || sum%5==0 || sum%7==0) 
		    {
		    	System.out.println("Lucky no");
		    }else
		    {
		    	System.out.println("Sorry its not my lucky number");
		    }
		}else
		{
			System.out.println(p+" is not valid no");
		}
	}

}
