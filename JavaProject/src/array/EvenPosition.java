package array;
import java.util.Scanner;
public class EvenPosition {
	public static void evenPosition(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
			   System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array");
		int a[]=new int[5];
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		EvenPosition.evenPosition(a);
	}

}
