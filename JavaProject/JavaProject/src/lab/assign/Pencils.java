package lab.assign;
import java.util.Scanner;
public class Pencils {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the standard:");
		int num=sc.nextInt();
		int sum=0;
		
		
			if(num<=12 && num>=1)
			{
		for(int i=1;i<=num;i++)
		{
			sum=sum+(i*i);
		}System.out.println("Nilu gets "+sum+" pencils.");
			}else
			{
				System.out.println("Invalid Standart");
			}
		
		}
	}


