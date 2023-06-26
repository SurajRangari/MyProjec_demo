package loop030523;
import java.util.Scanner;
public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Check no. is Krishnamurti or not
		// Cond: xyz = x! + y! +z!
		// eg: 145
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no:");
		int num= sc.nextInt();
		int sum=0;
		int temp=num;
		while (num>0)
		{
			int digit=num%10;
			int num1=1;
			for (int i=1;i<=digit;i++)
			{
				num1=num1*i;
			}
			sum= sum+num1;
			num =num/10;
			
		}
		num=temp;
		if (sum==num)
		{
			System.out.println("Krishnamurti No.");
		}
		else
		{
			System.out.println("Not Krishnamurti no.");
		}
		
	}

}
