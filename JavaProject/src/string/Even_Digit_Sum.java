package string;
import java.util.Scanner;
public class Even_Digit_Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		int sum=0;
		char[] c=s.toCharArray();
		//String st[]=s.split("");
		for (char c1:c)
		//for (int i=0;i<s.length();i++)
		{
			if(Character.isDigit(c1))
			//if (c.length>='0' && c.length<='9')
			{
				if(c1%2==0)
				//if (c.length%2==0)
				{
					System.out.print(c1);
					sum=sum+Character.getNumericValue(c1);
				}
			}
		}System.out.println(sum);
		

	}

}
