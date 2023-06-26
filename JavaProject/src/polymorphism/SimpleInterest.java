package polymorphism;
import java.util.Scanner;
public class SimpleInterest {
	Scanner sc=new Scanner(System.in);
	float p=sc.nextFloat();
	float r=sc.nextFloat();
	
	float si;
	int m=sc.nextInt();
	public void loan(float rate )
	{
		si= p*r*m/100;
		System.out.println(si);
	}
	public void loan(int month)
	{
		
		
			if (m<=6)
			{
				si=p*r*m/100;
				System.out.println(si);
			}else 
			{
				si=p*2*r*m/100;
				System.out.println(si);
			}
		
	}
	public static void main(String args[]) {
		SimpleInterest st=new SimpleInterest();
		st.loan(7);
	}

}
