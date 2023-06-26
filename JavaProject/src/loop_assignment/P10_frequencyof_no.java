package loop_assignment;
import java.util.Scanner;
public class P10_frequencyof_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
		System.out.println("Digit\tFrequency");
		for (int i=0;i<=9;i++)
		{
		    int count=0;
		    int copy=num;
		    while (copy>0)
		    {
		    	if (copy%10==i)
		    	{
		    		count++;
		    	}
		    	copy=copy/10;
		    }
		    if (count>0)
		    {
		    System.out.println(" "+i+"          "+count);
		    }
		}

	}

}
