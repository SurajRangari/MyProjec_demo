package loop030523;
import java.util.Scanner;
public class Loop6 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no.");
		int num =sc.nextInt();
		int count=0;
		int sum=0;
		int copy=num;
		int power=1;
		while(num>0)
		{
			count++;
			num=num/10;
		}System.out.println(count);
		num=copy;
		while(num>0)
		{
			int digit=num%10;
			for (int i=1;i<count;i++) {
				power=power*digit;
				sum=sum+power;
				count--;
			}
		}
	}

}
