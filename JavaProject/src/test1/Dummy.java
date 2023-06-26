package test1;
import java.util.Scanner;
public class Dummy {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.");
	int num=sc.nextInt();
	int cube=num*num*num;
	while (num>0)
	{
		if (num%10!=cube%10)
		{
			System.out.println("No. is not Trimorphic");
			break;
		}
		num=num/10;
		cube=cube/10;
	}
	if (num==0)
	{
		System.out.println("Trimorphic no.");
	}
		
	}

}
