package test1;
import java.util.Scanner;
public class Trimorphic {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no.");
		int num=sc.nextInt();
		int copy=num;
		int prod;
		int count=0;
		int power=1;
		while(num>0)
		{
			count++;
			int digit=num%10;
			num=num/10;
		}System.out.println(count);
		prod=copy*copy*copy;
		for (int i=1;i<=count;i++) {
			power=power*10;
		}
		int n =prod%power;
		if (copy==n)
		{
			System.out.println("Trimorphic no.");
		}else {
			System.out.println("Not Trimorphic no.");
		}

	}

}
