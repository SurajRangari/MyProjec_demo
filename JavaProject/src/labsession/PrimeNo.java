package labsession;
import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//Finding prime numbers from No. given by user
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no.");
		int num= sc.nextInt();
		int i;
		while (num>0)
		{
			boolean isprime=true;
		      int digit=num%10;
		      for (i=2;i<digit;i++)
		      {
		        if (digit%i==0)
			    {
				isprime=false;
				break;
			    }
				
		      }
		
		
		if (isprime==true)
				{
					System.out.println(digit);
				}
				num=num/10;
			}
		
	}
}

