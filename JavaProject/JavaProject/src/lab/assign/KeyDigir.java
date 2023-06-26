package lab.assign;
import java.util.Scanner;
public class KeyDigir {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n1=sc.nextInt();
		System.out.println("Enter key digit");
		int n2=sc.nextInt();
		int count=0;
		int n=n1;
		while (n1>0)
		{
		  int digit=n1%10;
		  if (digit==n2)
		  {
			  count++;
			  
		  }n1=n1/10;
		}System.out.println(n2+" appear "+count+" times in "+n);
		

	}

}
