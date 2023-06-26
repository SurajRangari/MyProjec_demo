package test1;
import java.util.Scanner;
public class TwinPrime {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enters both no.");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int fact1=0;
	int fact2=0;
	int i=2;
	while ((i<=n1) || (i<=n2)) {
		if (n1%i==0)
		{
			fact1++;
		}
		if (n2%i==0)
		{
			fact2++;
		}
		i++;
	}
	int difference=n2-n1;
	if(difference==2 || difference==-2 && (fact1==1 && fact2==1))
	{
		System.out.println("Twin Prime no.");
	}else
	{
		System.out.println("Not Twin Prime");
	}
	}
}
