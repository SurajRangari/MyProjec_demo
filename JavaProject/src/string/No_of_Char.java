package string;
import java.util.Scanner;
public class No_of_Char {
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		int count=0;
		
		
		//count each character from string except space  
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)!=' ')
			{
				count++;
			}
		}System.out.println("No. of char. from string="+count);
				
	}

}
