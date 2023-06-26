package string;
import java.util.Scanner;
public class Toggel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		String toggle=null;
		String[] s1=s.split(" ");
		for (int i=0;i<s1.length;i++)
		{
			if (s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				// s.replace(s.charAt(i), (char)(s.charAt(i)-32));
				toggel= toggel + (char)(s.charAt(i)-32); 
				 
			}
			if (s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				s.replace(s.charAt(i), (char)(s.charAt(i)+32));
				
			}
		}
		System.out.println(s);

	}

}
